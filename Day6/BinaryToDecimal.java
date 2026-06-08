//Program to convert Binary to Decimal

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");   //Input the binary number
        int binary = sc.nextInt();

        int decimal = 0, base = 1, rem;       //taking the variables 

        while (binary > 0) {
            rem = binary % 10;
            decimal = decimal + rem * base;
            binary = binary / 10;
            base = base * 2;
        }

        System.out.println("Decimal number: " + decimal);

        sc.close();
    }
}
