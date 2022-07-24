package lesson_4.basic;

public class Monkey {
    private int weight;
    private String kind;

    public Monkey(int weight, String kind) {
        this.weight = weight;
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
