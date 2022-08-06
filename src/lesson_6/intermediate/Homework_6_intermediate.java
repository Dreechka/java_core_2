package lesson_6.intermediate;

import lesson_6.basic.Car;
import lesson_6.basic.Lada;
import lesson_6.basic.Toyota;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework_6_intermediate {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        Car[] cars = new Car[40];
        for (int i = 0; i < 10; i++) {
            cars[i] = CarFactory.createToyota();
            cars[i + 10] = CarFactory.createLada();
        }

        for (Car car : cars) {
            // Спросить Юру почему не работает тернарный оператор.
            //car instanceof Toyota ? ((Toyota) car).turnOnMusic() : ((Lada) car).brakeDown();

            if (car instanceof Toyota) {
                ((Toyota) car).turnOnMusic();
            }
            if (car instanceof Lada) {
                ((Lada) car).brakeDown();
            }
        }

        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        Random random = new Random(1);
        FinancialRecord[] records = new FinancialRecord[10];
        for (int i = 0; i < 10; i++) {
            records[i] = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
        }

        File file = new File("C:\\repos\\src\\lesson_6\\lesson_8.intermediate\\report.txt");
        try (FileWriter fileWriter = new FileWriter(file); BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (FinancialRecord record : records) {
                stringBuilder.append("доходы = ").append(record.getIncomes()).append(", ").
                        append("расходы = ").append(record.getOutcomes()).append('\n');
                fileWriter.write(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            fileWriter.flush();

            List<String> data = new ArrayList<>();
            while (bufferedReader.ready()) {
                data.add(bufferedReader.readLine());
            }

            int totalIncomes = 0;
            int totalOutcomes = 0;
            for (String string : data) {
                String[] temp = string.split(" ");
                totalIncomes += Integer.parseInt(temp[2].substring(0, temp[2].length() - 1));
                totalOutcomes += Integer.parseInt(temp[5]);
            }
            System.out.println("общие доходы - " + totalIncomes + ',' + " общие расходы - " + totalOutcomes);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

