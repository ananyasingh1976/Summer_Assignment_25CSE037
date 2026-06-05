//Program to check whether given no is palindrome or not

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;

        while (num != 0) 
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (temp == reverse) 
        {
            System.out.println("Number is Palindrome");
        } else 
        {
            System.out.println("Number is Not Palindrome");
        }
        sc.close();
    }
}
