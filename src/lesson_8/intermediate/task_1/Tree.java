package lesson_8.intermediate.task_1;

public abstract class Tree implements Smellable {
    public boolean haveBumps;

    public Tree(boolean haveBumps) {
        this.haveBumps = haveBumps;
    }

    @Override
    public void canSmell() {
        System.out.println("Умеет пахнуть");
    }
}
