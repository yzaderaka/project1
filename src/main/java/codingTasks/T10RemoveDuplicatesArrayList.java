package codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T10RemoveDuplicatesArrayList {

    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Yaroslav");
        listWithDuplicates.add("abracadabra");
        listWithDuplicates.add("Zaderaka");
        listWithDuplicates.add("Yaroslav");
        listWithDuplicates.add("Syntax");

        List<String> listWithoutDuplicates = new ArrayList<>();

        for (String item : listWithDuplicates) {
            if (!listWithoutDuplicates.contains(item)) {
                listWithoutDuplicates.add(item);
            }
        }

        System.out.println(listWithoutDuplicates);
    }
}
