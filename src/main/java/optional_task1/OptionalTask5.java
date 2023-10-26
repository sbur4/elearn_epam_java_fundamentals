package optional_task1;

public class OptionalTask5 {

    public static void main(String[] args) {
        int evenDigitsOnlyCount = 0;
        int evenAndOddDigitsEqualCount = 0;

        for (String number : args) {
            if (containsOnlyEvenDigits(number)) {
                evenDigitsOnlyCount++;
            } else if (hasEqualEvenAndOddDigitCount(number)) {
                evenAndOddDigitsEqualCount++;
            }
        }

        System.out.println("Count only even digits: " + evenDigitsOnlyCount);
        System.out.println("Count equals even and odd digits: " + evenAndOddDigitsEqualCount);
    }

//  System.out.println("Even digit: " + num);
//     System.out.println("Odd digit: " + num);
    public static boolean containsOnlyEvenDigits(String number) {
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int num = Character.getNumericValue(digit);
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasEqualEvenAndOddDigitCount(String number) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int num = Character.getNumericValue(digit);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return evenCount == oddCount;
    }
}