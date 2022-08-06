package lesson_8.intermediate.task_1;

public class Fern extends Plant implements Bloomable {

    @Override
    public void canBloom() {
        System.out.println("папоротник: умеет цвести");
    }
}
