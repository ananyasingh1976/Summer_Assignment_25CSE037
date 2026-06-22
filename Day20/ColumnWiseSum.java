//Program to Find Column Wise Sum

import java.util.Scanner;
public class ColumnWiseSum {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}
