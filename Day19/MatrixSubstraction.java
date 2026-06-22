//Program to Substract Matrices

import java.util.Scanner;

public class MatrixSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 2, cols = 2;
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = A[i][j] - B[i][j];

        System.out.println("Difference Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(diff[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
