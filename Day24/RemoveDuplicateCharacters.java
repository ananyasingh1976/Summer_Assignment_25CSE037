//Program to Remove Duplicate Charcters from a String

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("After Removing Duplicates: " + result);

        sc.close();
    }
}
