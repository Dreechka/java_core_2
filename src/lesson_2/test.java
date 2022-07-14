package lesson_2;

public class test {
    public static void main(String[] args) {
        String input = "79991113344";
        //И****в Иван И.
        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println(stringBuilder.append(input.substring(0, 4) + "***" + input.substring(7)).append(";"));
        

    }}
