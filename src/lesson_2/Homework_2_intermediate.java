package lesson_2;

import java.util.Arrays;
import java.util.Locale;

public class Homework_2_intermediate {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String s1 = "234";
        String s2 = "some_text";
        System.out.println(Integer.parseInt(s1) + s2.length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        System.out.println((int) Math.pow(a + b, 2));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] first = {1, 2, 5, 7, 10};
        int[] second = {2, 3, 2, 17, 15};
        int[] result = new int[first.length + second.length + (first.length + second.length) / 2];
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
            result[i + first.length] = second[i];
            result[i + 2 * first.length] = first[i] * second[i];
        }
        System.out.println(Arrays.toString(result));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String hello = "Hello world!";
        System.out.println(hello.replace('l', 'r').toUpperCase(Locale.ROOT).substring(0, 8));
    }


}
