package lesson_8.expert.task_2;

public class Car {
    private int price;

    public Car(int price) {
        this.price = price;
    }


    public void printPrice() throws PriceException {
        if (price < 0) {
            throw new PriceException("Неизвестна мне - (вызванно из объекта Car)");
        }
        System.out.println(price + " - (вызванно из объекта Car)");
    }
}
