package lesson_6.basic;

public abstract class Car {

    public void startMoving(){
        System.out.println("Автомобиль начал движение");
    }

    public void stop(){
        System.out.println("Автомобиль остановился");
    }

    public void turnOnLights(){
        System.out.println("Включил фары");
    }
}
