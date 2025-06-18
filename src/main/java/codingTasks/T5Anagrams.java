package codingTasks;

import java.util.Arrays;

public class T5Anagrams {

    static boolean isAnagrams(String str1, String str2){
        str1=str1.trim().toLowerCase();
        str2=str2.trim().toLowerCase();

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagrams("Night "," thing"));
    }
}
