package m1;

import java.util.LinkedList;
import java.util.Scanner;

public class secode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of words
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        scanner.close();

        int totalChanges = 0;
        for (String word : words) {
            totalChanges += countChanges(word);
        }

        System.out.println("Total minimum substitutions: " + totalChanges);
    }

    // Helper method to count the minimum changes for a single word
    private static int countChanges(String word) {
        int changes = 0;
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : word.toCharArray()) {
            if (!charList.isEmpty() && charList.getLast() == c) {
                changes++;
                charList.removeLast(); // Remove the last character
            } else {
                charList.add(c); // Add the current character
            }
        }
        return changes;
    }
}
