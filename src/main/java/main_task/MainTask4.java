package main_task;

public class MainTask4 {
    public static void main(String[] args) {
        int[] numsArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numsArr[i] = Integer.parseInt(args[i]);
        }
//        System.out.println(Arrays.toString(numsArr));
        System.out.println(numsSum(numsArr));
        System.out.println(numsMulti(numsArr));
    }

    private static int numsSum(int[] numsArr) {
        int result = 0;
        for (int i : numsArr) {
            result += i;
        }
        return result;
    }

    private static int numsMulti(int[] numsArr) {
        int result = 1;
        for (int i : numsArr) {
            result *= i;
        }
        return result;
    }
}