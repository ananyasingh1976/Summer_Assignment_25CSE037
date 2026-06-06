package Day3;
//Program to Print Prime Numbers in a Range

import java.util.Scanner;
public class PrimeRange
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between" + start + "and" + end + "are:");
        for (int num= start; num<=end; num++) 
        {
            boolean isPrime = true;
            if(num<=1)
            {
                isPrime = false;
            }
            else 
            {
                for(int i= 2; i<=num/2; i++)
                {
                    if(num%i ==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime)
            {
                System.out.println(num + " ");
            }
        }
        sc.close();
    }
}
