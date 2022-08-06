package lesson_8.intermediate.task_1;

import lesson_8.intermediate.task_1.Bloomable;

public abstract class Plant implements Bloomable {

    @Override
    public void canBloom() {
        System.out.println("Умеет цвести");
    }
}
