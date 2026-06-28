//Program to Create Salary Management System

import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] basic = new double[n];
        double[] hra = new double[n];
        double[] da = new double[n];
        double[] gross = new double[n];

        // Input employee details
        for (i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Basic Salary: ");
            basic[i] = sc.nextDouble();

            hra[i] = basic[i] * 0.20;   // 20% HRA
            da[i] = basic[i] * 0.10;    // 10% DA
            gross[i] = basic[i] + hra[i] + da[i];
        }

        // Display salary details
        System.out.println("\n------ Salary Report ------");

        for (i = 0; i < n; i++) {
            System.out.println("\nEmployee ID : " + id[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Basic Salary: " + basic[i]);
            System.out.println("HRA         : " + hra[i]);
            System.out.println("DA          : " + da[i]);
            System.out.println("Gross Salary: " + gross[i]);
        }

        sc.close();
    }
}
