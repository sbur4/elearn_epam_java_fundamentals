package tests;

public class Arithmetic {

    static int j = 2;

    public static void main(String[] args) {
        typeConverterExample();
        typeConverterExample2();

        char i = '1';
        result(i);
        System.out.println(i + " " + j);
        //1 4
    }

    public static void typeConverterExample() {
        int a = 129;
        byte b = 3;
        Object ab = (byte) a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
        //java.lang.Integer value: -124 correct
    }

    public static void typeConverterExample2() {
        long a = 2147483647000L;
        int b = 1;
        b += a;
        Object ab = (Object) b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
        // java.lang.Integer value: -999 correct
    }

    public static void result(int i) {
        i *= 10;
        j += 2;
    }
}