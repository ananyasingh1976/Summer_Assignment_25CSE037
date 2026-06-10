//Program to Print Character Triangle

import java.util.Scanner;

public class CharacterTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Character Triangle Pattern
        for (int i = 1; i <= rows; i++) 
            {
            for (char ch = 'A'; ch < 'A' + i; ch++) 
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
