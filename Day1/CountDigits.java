 //Program to count digits in a number

 import java.util.Scanner;
 class CountDigits
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        //Input the number
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int count=0;
        int temp=num;

        //Count digits 
        while(temp!=0)
        {
            temp = temp/10;
            count++;

        }
        System.out.println("Number of digits:" + count);
        sc.close();

    }
 }