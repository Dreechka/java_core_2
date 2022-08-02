package lesson_2;

public class Homework_2_basic {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        String result = (hi.trim() + world.toLowerCase());
        System.out.println((result + newLine).repeat(3));


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double height = 1.82;
        double weight = 75;
        System.out.println(weight / (height * height));

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        char[] symbols = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(String.valueOf(symbols).replace(symbols[3], 'h'));
    }


}
