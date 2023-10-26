package main_task;

public class MainTask3 {
    public static void main(String[] args) {
        int randomNumber;
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        for (int i = start; i < end; i++) {
            randomNumber = (int) (start + (Math.random() * end));
            if (randomNumber % 2 == 0) {
                System.out.println(randomNumber + " ");
            } else {
                System.out.print(randomNumber + " ");
            }
        }
        System.out.println(System.lineSeparator());
    }
}