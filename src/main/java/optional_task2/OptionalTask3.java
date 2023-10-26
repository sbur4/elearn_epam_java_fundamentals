package optional_task2;

import java.util.Random;

public class OptionalTask3 {
    private static int rows = 4;
    private static int cols = 4;
    private static int[][] matrix = new int[rows][cols];
    private static int from = -10;
    private static int to = 25;

    public static void main(String[] args) {
        createMatrix();
        sumElementsRow(matrix);
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

    private static void sumElementsRow(int[][] matrix) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    start = j;
                    System.out.println("1st positive digit: " + matrix[i][start]);
                    break;
                }
            }
            for (int j1 = start + 1; j1 < matrix[i].length; j1++) {
                if (matrix[i][j1] > 0) {
                    end = j1;
                    System.out.println("2nd positive digit: " + matrix[i][end]);
                    break;
                }
            }
            int sum = 0;
            for (int s = start; s < end + 1; s++) {
                sum = sum + matrix[i][s];
            }
            {
                System.out.println("Sum elements: " + sum);
            }
        }
    }
}