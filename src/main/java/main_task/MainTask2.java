package main_task;

public class MainTask2 {
    public static void main(String[] args) {
        String inputString = args[0];
        char[] ch = inputString.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println(System.lineSeparator());
    }
}