package lesson_6.expert;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework_6_expert {
    public static void main(String[] args) throws IOException {
        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Читать файлы нужно через
        //Прочитать все файлы из папки
        /*String path1 = "C:\\repos\\out\\resourses";
        Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));*/

        File file = new File("C:\\repos\\out\\resourses");
        File[] files = file.listFiles();

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд
        // Задача №2
        // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результата:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд

        if (files != null) {
            getPyterochkaData(files);
            allOutcomes(files);
        }

    }

    private static void getPyterochkaData(File[] files) throws IOException {
        Pattern pattern = Pattern.compile("(\\d+\\/\\d{4}$)");
        Map<String, Double> data = new HashMap<>();
        for (File f : files) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            bufferedReader.readLine(); //пропуск строки "магазин;доход;расход;дата"
            while (bufferedReader.ready()) {
                String[] separatedString = bufferedReader.readLine().split(";");
                if (separatedString[0].equals("pyterochka")) {
                    Matcher matcher = pattern.matcher(separatedString[3]);
                    matcher.find();
                    String date = matcher.group(1).replace('/', '.');
                    if (!data.containsKey(date)) {
                        data.put(date, Double.parseDouble(separatedString[1]) - Double.parseDouble(separatedString[2]));
                    } else {
                        data.put(date, data.get(date) + (Double.parseDouble(separatedString[1]) - Double.parseDouble(separatedString[2])));
                    }
                }
            }
        }
        System.out.println("Прибыль по магазину pyterochka по месяцам");
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            String date = ("0000000" + entry.getKey()).substring(entry.getKey().length());
            System.out.println(date + ": " + entry.getValue());
        }
    }


    private static void allOutcomes(File[] files) throws IOException {
        Map<String, Double> data = new HashMap<>();
        for (File f : files) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            bufferedReader.readLine(); //пропуск строки "магазин;доход;расход;дата"
            while (bufferedReader.ready()) {
                String[] separatedString = bufferedReader.readLine().split(";");
                if (!data.containsKey(separatedString[0])) {
                    data.put(separatedString[0], Double.parseDouble(separatedString[2]));
                } else {
                    data.put(separatedString[0], data.get(separatedString[0]) + Double.parseDouble(separatedString[2]));
                }
            }
        }
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            System.out.println("Расходы " + entry.getKey() + " за весь период: " + entry.getValue());
        }
    }
}


