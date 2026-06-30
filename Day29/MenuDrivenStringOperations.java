//Program To create Menu Driven String Operations

import java.util.Scanner;

public class MenuDrivenStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        sc.nextLine(); // Clear buffer (if needed)
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== STRING OPERATIONS MENU =====");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("String: " + str);
                    break;

                case 2:
                    System.out.println("Length: " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 5:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + rev);
                    break;

                case 6:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    if (str.equalsIgnoreCase(reverse)) {
                        System.out.println("The string is a Palindrome.");
                    } else {
                        System.out.println("The string is not a Palindrome.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
