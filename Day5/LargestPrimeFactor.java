//Program to Find Largest Prime Factor

import java.util.Scanner;
public class LargestPrimeFactor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
         //Input the number
         System.out.println("Enter a number: ");
         int num = sc.nextInt();
         int largestPrime =1;
         for ( int i =2 ;i <= num;i++)
         {
            while(num%i==0)
            {
                largestPrime = i;
                num=num/i;
            }
         }
         System.out.println("Largest Prime Factor=" + largestPrime);
         sc.close();
    }
}
