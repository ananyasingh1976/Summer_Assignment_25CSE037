//Program to Print Factors of a Number

import java.util.Scanner;
public class PrintFactor
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);

    //Input the number
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
     System.out.println("Factors of" +num+ "are: ");

     for(int i =1; i<=num ; i++)
     {
        if(num% i==0)
        {
            System.out.print(i + " ");
        }
     }
     sc.close();
  } 
}