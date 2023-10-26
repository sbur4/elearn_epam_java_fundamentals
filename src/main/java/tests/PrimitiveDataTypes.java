package tests;

public class PrimitiveDataTypes {
    //1
    String cityOfFlat = "Minsk"; // -
    char entrance = '1'; // 2
    boolean isInTheCenter = true; // 1
    Object country = new Object(); //-
    double square = 104.79; // 8
    int countOfFloors = 9; // 4
    byte appartmentsCount = 3; // 1
    //16 byte

    //2 wrong
    double d1 = 0.0f;
    //Double d2 = new Double(.0f);
    //Double d3 = 0.0f;
    Double d4 = new Double("1L");
    Double d5 = 0.d;
    //Double d6 = 1L;

    //3 wrong
    int i1 = Integer.parseInt("14");
    Integer i2 = 85;
    //int i3 = Integer.decode('12');
    int i4 = Integer.valueOf("21");
    //int i5 = Integer.valueOf(null);
    int i6 = new Integer("15");

    //4 right
    //System.out.println(newInteger(null));-
    //System.out.println(newString(null));-
    //System.out.println(newString("null"));+
    //System.out.println((char[])null);-
    //System.out.println((true?null:0));+
    //System.out.println((String)null);+

    //5
    public static void main(String args[]){
        Byte b = new Byte("3");  // line 1
        System.out.println(b.floatValue() + " " + b.getClass().getName());  // line 2

    //3.0 java.lang.Byte correct

    //6
    Double d = Double.POSITIVE_INFINITY;
    double d1 = d.intValue() + Double.NEGATIVE_INFINITY;
    System.out.println(d1);
    //-Infinity correct

    }
}