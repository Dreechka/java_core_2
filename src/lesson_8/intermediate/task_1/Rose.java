package lesson_8.intermediate.task_1;

public class Rose extends Plant implements Smellable {

    @Override
    public void canBloom() {
        System.out.println("роза: умеет цвести");
        ;
    }

    @Override
    public void canSmell() {
        System.out.println("роза: умеет пахнуть");
    }
}
