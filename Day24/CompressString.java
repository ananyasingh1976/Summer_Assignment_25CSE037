//Program to Compress a String

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(str.charAt(i)).append(count);
            count = 1;
        }

        System.out.println("Compressed String: " + result);

        sc.close();
    }
}