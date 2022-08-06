package lesson_8.expert.task_2;

public class Homework_8_expert_task_2 {
    //Экспертный уровень:
    //Задача №2
    // Реализовать паттерн Decorator для класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
    // Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0
    // Для этого шаблона характерно:
    // 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя экземпляр класса основы
    // 2. Вызов всех методов происходит у декоратора
    // Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
    // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
    // 5000 - (вызванно из объекта Car)
    // Хочешь купить авто? (Вызвано из объекта CarShop)

    // Если стоимость машины меньше нуля:
    // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
    // Неизвестна мне - (вызванно из объекта Car)
    // Давайте посмотрим другое авто? (Вызвано из объекта CarShop)
    public static void main(String[] args) {
        CarShop carShop1 = new CarShop(new Car(5000));
        carShop1.sellCar();
        CarShop carShop2 = new CarShop(new Car(-10));
        carShop2.sellCar();
    }
}