package codingTasks;

public class T6Vowels {

    static int howManyVowels(String str){
        str.toLowerCase();
        int count=0;
        for (char c: str.toCharArray()){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        return count;
        }

    public static void main(String[] args) {
        System.out.println(howManyVowels("documentation"));
    }
    }


