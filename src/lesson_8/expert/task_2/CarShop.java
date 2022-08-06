package lesson_8.expert.task_2;

public class CarShop {
    private Car decoratedCar;

    public CarShop(Car car) {
        decoratedCar = car;
    }

    public void sellCar() {
        System.out.println("Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):");
        try {
            decoratedCar.printPrice();
            System.out.println("Хочешь купить авто?");
        } catch (PriceException e) {
            System.out.println(e.getMessage() + "\nДавайте посмотрим другое авто? (Вызвано из объекта CarShop)");
        }

    }
}
