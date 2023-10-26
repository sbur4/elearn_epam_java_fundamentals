package optional_task1;

import java.util.Arrays;

public class OptionalTask7 {

    public static void main(String[] args) {
        String[] intArr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.toString(Integer.parseInt(args[i]));
        }
        System.out.println(Arrays.toString(intArr));
        arrItr(intArr);
    }

    private static void arrItr(String[] intArr) {
        int count = 0;
        for (String str : intArr) {
            if (checkNums(str)) {
//                System.out.print(str + " ");
                count++;
                if (count == 1)
                    System.out.println(str);
            }
        }
    }

    private static boolean checkNums(String str) {
        boolean flag = true;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}