package codingTasks;

public class T7CountNumOfWordsInString {

    static int countWords(String str) {

        String[] words = str.trim().split("\\s+");
        return words.length;

    }

    public static void main(String[] args) {
        System.out.println(countWords("Yaroslav   Zaderaka"));
    }
}
