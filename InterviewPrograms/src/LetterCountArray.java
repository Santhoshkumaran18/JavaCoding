public class LetterCountArray {
    public static void main(String[] args) {
        String input = "DIFFERENT";
        String inputlowercase=input.toLowerCase();
        // Array to store counts of each letter (26 letters in the English alphabet)
        int[] letterCounts = new int[26];

        // Loop through each character in the string and count them
        for (char c : inputlowercase.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCounts[c - 'a']++;
            }
        }

        // Print the letters and their counts
        for (int i = 0; i < 26; i++) {
            if (letterCounts[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + letterCounts[i]);
            }
        }
    }
}
