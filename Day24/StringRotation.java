//Program to check String Rotation

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("String is a rotation");
        else
            System.out.println("String is not a rotation");

        sc.close();
    }
}