//Program to Create Library Management System

import java.util.Scanner;

class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] bookId = new int[max];
        String[] bookName = new String[max];
        String[] author = new String[max];
        boolean[] issued = new boolean[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("--------------------------------");
                            System.out.println("Book ID : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            found = true;
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            found = true;
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(search)) {
                            found = true;
                            System.out.println("\nBook Found:");
                            System.out.println("Book ID : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}