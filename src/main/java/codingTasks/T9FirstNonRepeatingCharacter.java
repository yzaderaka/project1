package codingTasks;

public class T9FirstNonRepeatingCharacter {

    public static Character findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Для ASCII символов

        // Первый проход: подсчет частот
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Второй проход: поиск первого символа с частотой 1
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
