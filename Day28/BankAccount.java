//Program to Create Bank Account System

import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] accNo = new int[max];
        String[] name = new String[max];
        double[] balance = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    accNo[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance[count] = sc.nextDouble();

                    count++;
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No accounts found.");
                    } else {
                        System.out.println("\n----- Account Details -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("---------------------------");
                            System.out.println("Account No : " + accNo[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Balance    : ₹" + balance[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == depAcc) {
                            System.out.print("Enter Deposit Amount: ");
                            double deposit = sc.nextDouble();
                            balance[i] += deposit;
                            System.out.println("Amount Deposited Successfully.");
                            System.out.println("New Balance: ₹" + balance[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == withAcc) {
                            System.out.print("Enter Withdrawal Amount: ");
                            double withdraw = sc.nextDouble();

                            if (withdraw <= balance[i]) {
                                balance[i] -= withdraw;
                                System.out.println("Withdrawal Successful.");
                                System.out.println("Remaining Balance: ₹" + balance[i]);
                            } else {
                                System.out.println("Insufficient Balance.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number to Search: ");
                    int search = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == search) {
                            System.out.println("\nAccount Found");
                            System.out.println("Account No : " + accNo[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Balance    : ₹" + balance[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You for using Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}