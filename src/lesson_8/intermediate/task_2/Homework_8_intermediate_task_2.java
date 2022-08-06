package lesson_8.intermediate.task_2;

public class Homework_8_intermediate_task_2 {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        Employee vasya = new Employee(new Watch(false));
        Employee evgenNicolaich = new Employee(new Watch(true));
        Store store1 = new Store(new Employee[]{vasya});
        Store store2 = new Store(new Employee[]{evgenNicolaich});
        Brand puma = new Brand(new Store[]{store1, store2});
        for (Store store : puma.getStores()) {
            for (Employee employee : store.getEmployee()) {
                try {
                    employee.getWatch().tic();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
