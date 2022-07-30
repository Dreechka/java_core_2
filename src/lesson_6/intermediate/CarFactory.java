package lesson_6.intermediate;

import lesson_6.basic.Lada;
import lesson_6.basic.Toyota;

public class CarFactory {

    public static Lada createLada(){
        return new Lada();
    }

    public static Toyota createToyota(){
        return new Toyota();
    }

}
