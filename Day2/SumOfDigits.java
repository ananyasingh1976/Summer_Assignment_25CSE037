//Program to find Sum of Digits 

import java.util.Scanner;
public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        //Input the number
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int sum =0;

        //Find sum of digits
        while(num!=0)
        {
            int digit =num%10;
            sum=sum+ digit;
            num=num/10;
        }
        System.out.println("Sum of digits=" +sum);
        sc.close();
    }
}
    

