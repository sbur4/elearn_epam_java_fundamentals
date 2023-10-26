package tests;

import java.math.BigDecimal;

public class EqualityRelational {
    public static void main(String[] args) {
        //1 false
        BigDecimal b1 = new BigDecimal("23.43");
        BigDecimal b2 = new BigDecimal("23.43");
        BigDecimal b3 = new BigDecimal("24");
        System.out.println(b1.compareTo(b2) == 0); //1
        System.out.println(b1.compareTo(b3) == 1); //2
        System.out.println(b1.equals(b2)); //3
        System.out.println(b1.equals(new BigDecimal("23.43"))); //4
        System.out.println(b1 == b2); //5
        b2 = b2.add(new BigDecimal("0.57"));
        System.out.println(b3.equals(b2)); //6
        //2 3 6

        //2
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.print(i1 == i2);
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.print(i3 == i4);
        //falsetrue correct
    }
}