//Program to create a Inventory Management System 

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[10];
        int[] quantity = new int[10];
        double[] price = new double[10];
        int count = 0;

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        sc.nextLine(); // Clear buffer

                        System.out.print("Enter Item Name: ");
                        itemName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();

                        count++;
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No items available.");
                    } else {
                        System.out.println("\nItem\t\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(itemName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(search)) {
                            System.out.println("Item Found:");
                            System.out.println("Name: " + itemName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Item Name to Update: ");
                    String update = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Item Name to Delete: ");
                    String delete = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(delete)) {

                            for (int j = i; j < count - 1; j++) {
                                itemName[j] = itemName[j + 1];
                                quantity[j] = quantity[j + 1];
                                price[j] = price[j + 1];
                            }

                            count--;
                            System.out.println("Item deleted successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
