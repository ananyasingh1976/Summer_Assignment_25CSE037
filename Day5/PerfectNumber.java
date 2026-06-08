// Program to Check Perfect Number

import java.util.Scanner;

public class PerfectNumber 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner (System.in); 

    //Input the number
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int sum =0;
    for (int i =1; i< num; i++)
    {
        if(num%i==0)
        {
            sum=sum+i;
        }
    }
    if (sum == num)
    {
        System.out.println(num+ " is a Perfect Number");
    }
    else
    {
        System.out.println(num+ " is not a Perfect number");
    }
    sc.close();
    }
}
