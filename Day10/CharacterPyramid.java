//Program to  print Character Pyramid

import java.util.Scanner;
public class CharacterPyramid 
{
    public static void main(String[] args) 
    {
        int rows = 5;

        for (int i = 1; i <= rows; i++) 
        {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }

            // Increasing characters
            for (char ch = 'A'; ch < 'A' + i; ch++) 
            {
                System.out.print(ch);
            }

            // Decreasing characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) 
            {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
