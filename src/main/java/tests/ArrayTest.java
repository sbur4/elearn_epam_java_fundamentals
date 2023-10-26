package tests;

import java.util.Arrays;

public class ArrayTest {

    //1 negative
    int[] mas1 = new int[24];
    Integer mas2[] = new Integer[24];
    //char[] mas3 = new Character [] {'a', 'b', 'c'};
    //Item [] mas4 = new Item {new Item (), new Item ()};
    double[] mas5 = {5, 10, 15, 20};
    int[] mas6[] = new int[4][5];
    int mas7[][] = new int[4][];

    //2 positive
    int a1[] = {};
    int a2[] = new int[]{1, 2, 3};
    //int a3[] = new int[](1,2,3);
    int a4[] = new int[3];
    //int a5[] = new int[3]{1,2,3};

    //Copy array
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        int arr[] = {4, 5, 6, 9};
        System.arraycopy(ar, 0, arr, 1, ar.length);
        System.out.println(Arrays.toString(arr));
    }
}