package codingTasks;

import java.util.ArrayList;
import java.util.List;

public class T8KeepStringStartWith {

    static List<String> startWithChar(List<String> strings) {
        List<String> validStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.toUpperCase().startsWith("A")) {
                validStrings.add(s);
            }
        }
        return validStrings;
    }

    public static void main(String[] args) {

        List<String> test = new ArrayList<>();
        test.add("Yaroslav");
        test.add("abracadabra");
        test.add("Zaderaka");
        test.add("Autumn");
        test.add("Syntax");
        System.out.println(startWithChar(test));

    }
}
