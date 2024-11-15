import java.util.List;
import Solutions.SortIntList;
import Solutions.SortStrList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInt = Arrays.asList(21, 23, 43, -20, 34, 0, 6, 23, 23, -20, 27, 9);
        List<String> listOfStr = Arrays.asList("pankaj", "Anand", "Saurabh", "anand", "pawan", "sharma");

        // SortIntList sortIntList = new SortIntList();
        // List<Integer> sortedIntList = sortIntList.getSortedIntList(listOfInt);
        // System.out.println("Sorted List using StreamApi is : " + sortedIntList);

        SortStrList sortStrList = new SortStrList();
        List<String> sortedStrList = sortStrList.getSortedStrList(listOfStr);
        System.out.println("Sorted String List using StreamApi : "+ sortedStrList);

    }
}
