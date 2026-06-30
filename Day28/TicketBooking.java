//Program to Create Ticket Booking System

import java.util.Scanner;

class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        int[] ticketId = new int[max];
        String[] passengerName = new String[max];
        String[] destination = new String[max];
        boolean[] booked = new boolean[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Search Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Ticket ID: ");
                    ticketId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    passengerName[count] = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destination[count] = sc.nextLine();

                    booked[count] = true;
                    count++;

                    System.out.println("Ticket Booked Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No tickets available.");
                    } else {
                        System.out.println("\n----- Ticket Details -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Ticket ID      : " + ticketId[i]);
                            System.out.println("Passenger Name : " + passengerName[i]);
                            System.out.println("Destination    : " + destination[i]);
                            System.out.println("Status         : " + (booked[i] ? "Booked" : "Cancelled"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancelId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ticketId[i] == cancelId) {
                            found = true;
                            if (booked[i]) {
                                booked[i] = false;
                                System.out.println("Ticket Cancelled Successfully.");
                            } else {
                                System.out.println("Ticket is already cancelled.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ticket not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to Search: ");
                    int searchId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (ticketId[i] == searchId) {
                            found = true;
                            System.out.println("\nTicket Found");
                            System.out.println("Ticket ID      : " + ticketId[i]);
                            System.out.println("Passenger Name : " + passengerName[i]);
                            System.out.println("Destination    : " + destination[i]);
                            System.out.println("Status         : " + (booked[i] ? "Booked" : "Cancelled"));
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ticket not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for using Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}