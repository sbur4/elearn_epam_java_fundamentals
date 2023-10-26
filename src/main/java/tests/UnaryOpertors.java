package tests;

public class UnaryOpertors {
    public static void main(String[] args) {
        long a = Long.remainderUnsigned(-2, 3);
        int b = Integer.remainderUnsigned(-2, 3);
        int c = -2 % 3;
        System.out.print(a +" "+b +" "+c);

        //2 2 -2
    }
}