package optional_task1;

import java.util.HashMap;
import java.util.Map;

public class OptionalTask4 {

    public static void main(String[] args) {
        String[] numbers = args;
        String result = findNumberWithMinimumUniqueDigits(numbers);
        System.out.println(result);
    }

    public static String findNumberWithMinimumUniqueDigits(String[] numbers) {
        String minNumber = null;
        int minUniqueDigits = Integer.MAX_VALUE;

        for (String number : numbers) {
            int uniqueDigits = countUniqueDigits(number);
            if (uniqueDigits < minUniqueDigits) {
                minUniqueDigits = uniqueDigits;
                minNumber = number;
            }
        }

        return minNumber;
    }

    public static int countUniqueDigits(String number) {
        Map<Character, Integer> digitCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (!digitCount.containsKey(digit)) {
                digitCount.put(digit, 1);
                count++;
            }
        }

        return count;
    }
}