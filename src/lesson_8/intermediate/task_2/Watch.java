package lesson_8.intermediate.task_2;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void tic() throws WatchBrokenError{
        if (isBroken){
            throw new WatchBrokenError("Ошибка: Часы сломались.");
        }
        System.out.println("Часы тикают");
    }
}
