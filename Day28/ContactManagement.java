//Program to Create contact management system

import java.util.Scanner;

class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        String[] name = new String[max];
        String[] phone = new String[max];
        String[] email = new String[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone[count] = sc.nextLine();

                    System.out.print("Enter Email: ");
                    email[count] = sc.nextLine();

                    count++;
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n----- Contact List -----");
                        for (int i = 0; i < count; i++) {
                            if (name[i] != null) {
                                System.out.println("----------------------------");
                                System.out.println("Name  : " + name[i]);
                                System.out.println("Phone : " + phone[i]);
                                System.out.println("Email : " + email[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i] != null && name[i].equalsIgnoreCase(search)) {
                            System.out.println("\nContact Found");
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Phone : " + phone[i]);
                            System.out.println("Email : " + email[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i] != null && name[i].equalsIgnoreCase(delete)) {
                            name[i] = null;
                            phone[i] = null;
                            email[i] = null;
                            found = true;
                            System.out.println("Contact Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for using Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}