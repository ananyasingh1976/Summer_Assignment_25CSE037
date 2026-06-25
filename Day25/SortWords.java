//Program to Sort Words by length

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        sc.close();
    }
}
