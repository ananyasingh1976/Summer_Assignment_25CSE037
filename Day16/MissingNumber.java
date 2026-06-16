//Program to Find Missing Number in Array

import java.util.Scanner;

public class MissingNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n - 1; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) 
        {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;

        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }
}