package codingTasks;

public class T9FirstNonRepeatingCharacter {

    public static Character findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Для ASCII символов

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("abracadabra"));
    }
}
