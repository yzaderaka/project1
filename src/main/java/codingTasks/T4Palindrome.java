package codingTasks;

public class T4Palindrome {

    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // очистка строки
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // допускается, но неэффективно
        }
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Yaroslav"));
        System.out.println(isPalindrome(" kayak "));
    }
}
