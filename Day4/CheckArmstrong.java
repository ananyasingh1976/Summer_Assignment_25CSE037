//Program to chexk a number is Armstrong number or not

import java.util.Scanner;
public class CheckArmstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Input the number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int remainder, result=0 ,digits=0;
        int temp = num;

        //Count Digits
        while(temp!=0)
        {
            temp/=10;
            digits++;
        }
        temp=num;
                
        while(temp!=0)
        {
            remainder = temp%10;
            result+=Math.pow(remainder,digits);
            temp/=10;
        }
        //Check Armstrong Number
        if (result == originalNum)
        {
            System.out.println(originalNum +" is an Armstrong Number");
        }
        else
        {
            System.out.println(originalNum+  " is not an Armstrong Number");
        }
        sc.close();
    }
}
