//Program to Write function to find Maximum

import java.util.Scanner;

public class MaximumFunction {

    // Function to find maximum
    static int findMaximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = findMaximum(num1, num2);

        System.out.println("Maximum number = " + max);
    }
}
