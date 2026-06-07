//Program to Print Armstring numbers in Range

import java.util.Scanner;

public class ArmstrongRange 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");  //Taking input of starting range
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");   //Taking input of ending range
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in the range:");

        for (int num = start; num <= end; num++) 
        {
            int originalNum = num;
            int result = 0, digits = 0;

            int temp = num;

            // Count digits
            while (temp != 0) 
            {
                temp /= 10;
                digits++;
            }

            temp = num;

            // Calculate Armstrong sum
            while (temp != 0)
            {
                int remainder = temp % 10;
                result += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (result == originalNum) 
            {
                System.out.print(originalNum + " ");
            }
        }

        sc.close();
    }
}