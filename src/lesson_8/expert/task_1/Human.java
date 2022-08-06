package lesson_8.expert.task_1;

public class Human {
    private int age;
    private String name;
    private int weight;

    private Human() {
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.printf("%s - возраст %d, вес %d", name, age, weight);
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }


    public static class HumanBuilder {
        private Human human;

        public HumanBuilder() {
            human = new Human();
        }

        public HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        public HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }

        public HumanBuilder weight(int weight) {
            human.setWeight(weight);
            return this;
        }

        public Human build() {
            return human;
        }

    }
}
