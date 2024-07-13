package m1;

public class NoPairsAllowed {

    public static void main(String[] args) {
        String[] words = {"add", "boook", "break"};
        for (String word : words) {
            int changes = minSubstitutions(word);
            System.out.println("For '" + word + "': " + changes + " change(s)");
        }
    }

    public static int minSubstitutions(String word) {
        int changes = 0;
        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                changes++;
                // Change the current character to a different one
                if (i < chars.length - 1) {
                    char nextChar = chars[i + 1];
                    chars[i] = (nextChar == 'a') ? 'b' : 'a';
                } else {
                    // If it's the last character, just change it to 'a'
                    chars[i] = 'a';
                }
            }
        }
        return changes;
    }
}

