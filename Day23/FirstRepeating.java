//Program to Find First Repeating Character

import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        String str = "programming";

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("First Repeating Character: " + ch);
                return;
            }
            set.add(ch);
        }

        System.out.println("No Repeating Character Found");
    }
}
