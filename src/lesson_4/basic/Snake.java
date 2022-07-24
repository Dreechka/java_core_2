package lesson_4.basic;

public class Snake {
    private double length;
    private String kind;

    public Snake(double length, String kind) {
        this.length = length;
        this.kind = kind;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}

