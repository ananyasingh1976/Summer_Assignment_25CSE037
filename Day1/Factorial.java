//Program to find Factorial of a number 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        //Input the number
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        long fact= 1;

        //Calculate Factorial
        for(int i =1 ; i<=num ; i++)
        {
            fact = fact * i ;
        }
         System.out.println("Factorial of " + num +  "is:" + fact);
         sc.close();
    }
    
}
