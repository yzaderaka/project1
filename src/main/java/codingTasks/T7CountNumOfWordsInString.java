package codingTasks;

public class T7CountNumOfWordsInString {

    static int countWords(String str){
       return str.split("[.,:;!?]").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Yaroslav Zaderaka"));
    }
}
