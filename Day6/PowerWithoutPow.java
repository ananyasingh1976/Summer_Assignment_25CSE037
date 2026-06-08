//Program to Find xⁿ Without pow()

import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");      //Input the base
        int x = sc.nextInt();

        System.out.print("Enter power (n): ");     //Input the power
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}