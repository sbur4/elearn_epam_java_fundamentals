package optional_task1;

import java.util.Arrays;

public class OptionalTask6 {

    public static void main(String[] args) {
        String[] intArr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.toString(Integer.parseInt(args[i]));
        }
        System.out.println(Arrays.toString(intArr));
        findDigit(intArr);
    }

    private static void findDigit(String[] intArr) {
        for (String string : intArr) {
            String str = String.valueOf(string);
            char[] arraySplit = str.toCharArray();
            int j = 0;
            while (j < arraySplit.length - 1) {
                if (arraySplit[j] >= arraySplit[j + 1]) {
                    break;
                } else if (j == arraySplit.length - 2) {
                    System.out.println(Arrays.toString(arraySplit));
                    return;
                } else {
                    j++;
                }
            }
        }
    }
}



