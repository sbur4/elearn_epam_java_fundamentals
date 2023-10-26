package optional_task2;

import java.util.Arrays;
import java.util.Random;

public class OptionalTask2 {
    private static int rows = 4;
    private static int cols = 4;
    private static int[][] matrix = new int[rows][cols];
    private static int from = -5;
    private static int to = 25;

    public static void main(String[] args) {
        createMatrix();
        displayDigits(matrix);
    }

    private static int[][] createMatrix() {
        Random random = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = random.ints(from, to + 1).findFirst().getAsInt();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static void displayDigits(int[][] matrix) {
        int count = 0;
        int decount = 0;
        int max = 0;
        int min = 0;
        int index = 0;
        int deindex = 0;
        int[] vector = new int[rows * cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                vector[i * rows + j] = matrix[i][j];
        }

        for (int k = 0; k < vector.length - 1; k++) {
            if (vector[k] < vector[k + 1]) {
                count++;
                if (count > max) {
                    max = count;
                    index = k + 1;
                }
            } else {
                count = 0;
            }
            if (vector[k] > vector[k + 1]) {
                decount++;
                if (decount > min) {
                    min = decount;
                    deindex = k + 1;
                }
            } else {
                decount = 0;
            }
        }

        System.out.println("Max sequence of increase digits: ");
        int[] sequence = new int[max + 1];
        System.arraycopy(vector, (index - max), sequence, 0, (max + 1));
        System.out.println(Arrays.toString(sequence) + " " + (max + 1) + " " + "elements");
        System.out.println("Max sequence of decrease digits: ");
        int[] desequence = new int[min + 1];
        System.arraycopy(vector, (deindex - min), desequence, 0, (min + 1));
        System.out.println(Arrays.toString(desequence) + " " + (min + 1) + " " + "elements");
    }
}