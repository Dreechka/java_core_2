package lesson_4.expert;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework_4_expert {
    // Экспертный уровень:
    // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
    // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
    // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
    // К474СЕ178 - где 178 регион

    // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
    // Не повторяющиеся
    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        Set<String> specialNumbers = new HashSet<>();
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        Matcher matcher;

        for (Map.Entry<Integer, Map<String, String[]>> entry : data.entrySet()) {
            Map<String, String[]> map = entry.getValue();
            for (Map.Entry<String, String[]> entry1 : map.entrySet()) {
                for (String number : entry1.getValue()) {
                    matcher = pattern.matcher(number);
                    if (matcher.find())
                        specialNumbers.add(number);
                }
            }
        }
        System.out.println(specialNumbers.size());
    }

    //Входящие данные
    // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
    // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
    // { 1 : {
    //      "out" : ["К474СЕ178"],
    //      "input": ["А222РТ178"]
    //    },
    //   2 : {
    //        "out" : ["К722АВ12", "А222РТ178"],
    //        "input" : ["М001АВ01", "А023РВ73"],
    //   }
    // ..
    //  }

    //Список технологий:
    // Set (HashSet) - узнать что это, set.contains(), set.put()
    // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
    // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
    // Регулярные выражения - вытащить регион авто
}
