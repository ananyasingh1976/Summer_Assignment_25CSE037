//Program to Write function to find Factorial

import java.util.Scanner;

public class FactorialFunction {

    // Function to find factorial
    static long factorial(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = factorial(num);

        System.out.println("Factorial = " + result);
    }
}
