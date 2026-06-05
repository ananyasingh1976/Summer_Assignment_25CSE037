//Program to Print Multiplication Table of a given number

import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);

        //Input the number
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        //Print Multiplication Table
        for(int i= 1; i<=10 ; i++)
        {
            System.out.println(num + "x" + i+ "=" +(num*i));

        }
        sc.close();
    }
}