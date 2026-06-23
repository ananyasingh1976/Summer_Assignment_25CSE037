//Program to Find Maximum Occuring Character

import java.util.*;

public class MaxOccuringCharacter {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Maximum Occurring Character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}
