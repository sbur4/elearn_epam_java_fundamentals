package optional_task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OptionalTask4 {
    private static int rows = 3;
    private static int cols = 3;
    private static int[][] matrix = new int[rows][cols];
    private static int from = 3;
    private static int to = 50;
    private static int maxValue = matrix[0][0];

    private static Set<Integer> rowsToDelete;
    private static Set<Integer> columnsToDelete;

    public static void main(String[] args) {
        System.out.println("Before: ");
        createMatrix();
        System.out.println();
//        System.out.println(findMaxValue(matrix));
        int[][] modifiedMatrix = deleteRowCol(matrix);
        System.out.println("After: ");
        printNewMatrix(modifiedMatrix);
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

    private static int findMaxValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    private static int[][] deleteRowCol(int[][] matrix) {
        int max = findMaxValue(matrix);
        determineCoordinatesMax(matrix, max);

        // Some debug prints:
        System.out.println("Maximum: " + max);
        System.out.println("Rows to delete: " + rowsToDelete);
        System.out.println("Columns to delete: " + columnsToDelete);
        System.out.println();

        int[][] modifiedMatrix = deleteRows(matrix);
        modifiedMatrix = deleteColumns(modifiedMatrix);
        return modifiedMatrix;
    }

    private static void determineCoordinatesMax(int[][] matrix, int maxValue) {
        rowsToDelete = new HashSet<>();
        columnsToDelete = new HashSet<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == maxValue) {
                    rowsToDelete.add(row);
                    columnsToDelete.add(col);
                }
            }
        }
    }

    private static int[][] deleteRows(int[][] matrix) {
        int rowsToLeave = matrix.length - rowsToDelete.size();
        int[][] modifiedMatrix = new int[rowsToLeave][];
        int i = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (!rowsToDelete.contains(row)) {
                modifiedMatrix[i] = matrix[row];
                i++;
            }
        }
        return modifiedMatrix;
    }

    private static int[][] deleteColumns(int[][] matrix) {
        int columnsAlreadyDeleted = 0;
        for (int columnToDelete : columnsToDelete) {
            // Delete the columns one by one:
            int[][] modifiedMatrix = new int[matrix.length][matrix[0].length - 1];
            for (int row = 0; row < matrix.length; row++) {
                int i = 0;
                for (int col = 0; col < matrix[row].length; col++) {
                    if (col != columnToDelete - columnsAlreadyDeleted) {
                        modifiedMatrix[row][i] = matrix[row][col];
                        i++;
                    }
                }
            }
            columnsAlreadyDeleted++;
            matrix = modifiedMatrix;
        }
        return matrix;
    }

    private static void printNewMatrix(int[][] modifiedMatrix) {
        for (int[] row : modifiedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}