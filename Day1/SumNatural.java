//Program to calculate sum of first N natural numbers

 import java.util.Scanner;
class SumNatural{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        //Input the number
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum =0;
        for(int i = 1; i <= n;i++)
        {
            sum = sum +i ;
        }
        System.out.println("Sum of first" +n+ "natural numbers="+ sum);
        sc.close();
    }
}
