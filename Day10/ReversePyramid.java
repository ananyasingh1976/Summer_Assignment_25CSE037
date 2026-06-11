//Program to Print Reverse Pyramid

import java.util.Scanner;
public class ReversePyramid 
{
    public static void main(String[] args) 
    {
        int rows = 5;

        for (int i = rows; i >= 1; i--) 
        {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) 
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
