package optional_task1;

import java.util.Arrays;

public class OptionalTask1 {

    public static void main(String[] args) {
        int[] intArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(intArr));
        int maxValue = findLargestNum(intArr);
        int maxLength = String.valueOf(maxValue).length();
        int minValue = findSmallestNum(intArr);
        int minLength = String.valueOf(minValue).length();
        System.out.println(maxValue + " = " + maxLength);
        System.out.println(minValue + " = " + minLength);
    }

    private static int findLargestNum(int[] intArr) {
        int maxValue = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > maxValue) {
                maxValue = intArr[i];
            }
        }
        return maxValue;
    }

    private static int findSmallestNum(int[] intArr) {
        int minValue = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < minValue) {
                minValue = intArr[i];
            }
        }
        return minValue;
    }
}