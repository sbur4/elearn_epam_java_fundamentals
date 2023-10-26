package optional_task1;

import java.util.Arrays;

public class OptionalTask2 {

    public static void main(String[] args) {
        int[] intArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(ascSort(intArr)));
        System.out.println(Arrays.toString(descSort(intArr)));
    }

    private static int[] ascSort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                int tmp = 0;
                if (intArr[i] > intArr[j]) {
                    tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        return intArr;
    }

    private static int[] descSort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                int tmp = 0;
                if (intArr[i] < intArr[j]) {
                    tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        return intArr;
    }
}