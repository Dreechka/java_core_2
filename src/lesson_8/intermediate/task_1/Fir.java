package lesson_8.intermediate.task_1;

public class Fir extends Tree{

    public Fir(boolean haveBumps) {
        super(haveBumps);
    }

    @Override
    public void canSmell() {
        System.out.println("ель : умеет пахнуть");
    }
}
