package Day3;
//Program to find LCM OF Two numbers

import java.util.Scanner;
public class LCM
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");     //taking input for first number
        int num1=sc.nextInt();
        System.out.println("Enter second number:");     //taking input for second number
        int num2=sc.nextInt();
         int max= (num1 > num2) ? num1 : num2;
         int lcm= max;
         while (true)
         {
            if( lcm% num1 == 0 && lcm%num2 == 0)
            {
                break;
            }
            lcm++;
            }
            System.out.println("LCM=" +lcm);
            sc.close();
         }
        }
