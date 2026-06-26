//Program to Create Quiz Application

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== Welcome to the Quiz Application =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.println("d) Chennai");
        System.out.print("Enter your answer: ");
        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        // Question 2
        System.out.println("\n2. Which language is used for Java programming?");
        System.out.println("a) C");
        System.out.println("b) Python");
        System.out.println("c) Java");
        System.out.println("d) HTML");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'c' || ans == 'C')
            score++;

        // Question 3
        System.out.println("\n3. How many days are there in a leap year?");
        System.out.println("a) 365");
        System.out.println("b) 366");
        System.out.println("c) 364");
        System.out.println("d) 360");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        // Display Result
        System.out.println("\n===== Quiz Result =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Good Job!");
        else
            System.out.println("Keep Practicing!");

        sc.close();
    }
}
