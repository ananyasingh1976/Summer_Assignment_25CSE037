//Program to find n Fibonacci Term

import java.util.Scanner;
public class FibonacciTerm 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
         
        //Input the number
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
         
        int first=0, second=1, next=0;
        
        if (n==1)
        {
            System.out.println("Nth Fibonacci term: " +first);
        }
        else if(n==2)
        {
            System.out.println("Nth Fibonacci Term: "+second);
        }
        else
        {
           for (int i = 3; i <= n; i++) 
            {
                next = first+ second;
                first = second;
                second = next;
            }
            System.out.println("Nth Fibonacci Term: " +second);
        }
        sc.close();
    }
}
