package lesson_8.intermediate.task_1;

public class Pine extends Tree{

    public Pine(boolean haveBumps) {
        super(haveBumps);
    }

    @Override
    public void canSmell() {
        System.out.println("сосна : умеет пахнуть");
    }
}
