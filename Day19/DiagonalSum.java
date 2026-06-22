//Program to find Diagonal Sum

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
        sc.close();
    }
}
