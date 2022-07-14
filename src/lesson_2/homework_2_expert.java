package lesson_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework_2_expert {
    public static void main(String[] args) {
        String text1 = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String text2 = "<client>(Какие то данные)<data></data></client>";
        String text3 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        System.out.println(coding(text1));
        System.out.println(coding(text2));
        System.out.println(coding(text3));
        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }

    public static String coding(String text) {
        //создание шаблона для поиска строки между тегами data
        Pattern pattern = Pattern.compile("<data>(.*)</data>");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        // получение строки между тегами data
        String result = matcher.group(1);
        if (result.length() == 0)
            return text;
        else {
            StringBuilder stringBuilder = new StringBuilder();
            String[] data = result.split(";");
            for (int i = 0; i < data.length; i++) {
                if (data[i].contains("@")) {
                    int firstIndex = data[i].lastIndexOf("@");
                    int lastIndex = data[i].lastIndexOf(".");
                    String replacement = "";
                    for (int j = 0; j < lastIndex - firstIndex - 1; j++)
                        replacement += "*";
                    stringBuilder.append(data[i].substring(0, firstIndex - 1)).append("*").append("@").append(replacement).append(data[i].substring(lastIndex)).append(";");
                    continue;

                }
                if (data[i].contains(" ")) {
                    String[] temp = data[i].split(" ");
                    String replacement = "";
                    for (int j = 1; j < temp[0].length() - 1; j++)
                        replacement += "*";
                    stringBuilder.append(temp[0].substring(0, 1)).append(replacement).append(temp[0].substring(temp[0].length() - 1)).append(" ").append(temp[1]).append(" ").append(temp[2].substring(0, 1)).append(".").append(";");


                } else
                    stringBuilder.append(data[i].substring(0, 4)).append("****").append(data[i].substring(7)).append(";");
            }
            return text.replaceAll(result, stringBuilder.substring(0, stringBuilder.length() - 1));
        }

    }
}
