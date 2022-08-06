package lesson_6.basic;

import java.io.*;

public class Homework_6_basic {
    public static void main(String[] args) {


        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них
        Toyota toyota = new Toyota();
        toyota.turnOnMusic();
        Lada lada = new Lada();
        lada.brakeDown();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\repos\\src\\lesson_6\\lesson_8.basic\\my_first_file.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bf.ready()) {
                stringBuilder.append(bf.readLine()).append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
        FinancialRecord financialRecord1 = new FinancialRecord(500, 300);
        File file = new File("C:\\repos\\src\\lesson_6\\lesson_8.basic\\report.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            String stringToFile = "доходы = " + financialRecord1.getIncomes() + ", " +
                    "расходы = " + financialRecord1.getOutcomes();
            fileWriter.write(stringToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
