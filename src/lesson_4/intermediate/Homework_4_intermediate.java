package lesson_4.intermediate;

public class Homework_4_intermediate {
    public static void main(String[] args) {
        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        double increment = 0.01123;
        double result = 0;
        int count = 0;
        while (result < 1_000_000) {
            if (increment < 0)
                break;
            result += increment;
            count++;
        }
        System.out.println(count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] input = {1, 1, 1, 1, 1};
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                input[i] = 0;
            }
        }

        // Задание №3:
        // Дано:
        boolean hasFuel = true;                //1000
        boolean hasElectricsProblem = true;     //5000
        boolean hasMotorProblem = true;         //10000
        boolean hasTransmissionProblem = false; //4000
        boolean hasWheelsProblem = false;        //2000
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        //public static int check()
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        double check = 0;
        int repairedParts = 0;
        if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
            check += 1000;
        }
        if (hasMotorProblem) {
            check += 10000;
            repairedParts++;
        }
        if (hasElectricsProblem) {
            check += 5000;
            repairedParts++;
        }
        if (hasTransmissionProblem) {
            check += 4000;
            repairedParts++;
        }
        if (hasWheelsProblem) {
            check += 2000;
            repairedParts++;
        }
        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            check = 0.8 * check;
        } else if (repairedParts == 2) {
            check = 0.9 * check;
        }
        System.out.println("Ваш счет сэр: " + (int) check);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        Warehouse warehouse = new Warehouse("Водка", 6);
        Workman gena = new Workman("Gena", warehouse);
        Workman anton = new Workman("Anton", warehouse);
        Workman evgen = new Workman("Evgen", warehouse);
        while (warehouse.getAvailableProduct() > 0) {
            gena.messUpGoods();
            anton.messUpGoods();
            evgen.messUpGoods();
        }

    }
}
