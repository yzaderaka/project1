package codingTasks;

public class T2AlphaCharacters {

    static int countChars(String str) {
        String aplha=str.replaceAll("[^A-Za-z]", "");
        return aplha.length();
    }

    public static void main(String[] args) {
        System.out.println(countChars("Yaroslav 23.12.1984!"));
    }
}
