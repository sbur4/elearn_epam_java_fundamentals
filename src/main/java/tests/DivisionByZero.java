package tests;

public class DivisionByZero {
    public static void main(String[] args) {
        //1
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        b = 3.0 / 0;
        c = 0 / 4.0;
        d = 0 / 0.0;
        sum = a + b + c + d;
        sumBC = b + c;
        comAB = a * b;
        System.out.print(sum + " " + sumBC + " " + comAB);
        //NaN Infinity -Infinity correct

        //2
        double x = 0, y = 2, z;
        z = y / x;
        System.out.println("z = " + z);
        //z= Infinity correct
    }
}