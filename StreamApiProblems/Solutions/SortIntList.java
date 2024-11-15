package Solutions;

import java.util.List;

public class SortIntList {
    
    public List<Integer> getSortedIntList(List<Integer> list){

        // natural sorting
        // List<Integer> nums =  list.stream().sorted().toList();

        // sorting based on unit place digits
        // List<Integer> nums = list.stream()
        //                          .map(obj -> String.valueOf(obj))
        //                          .sorted((obj1, obj2) -> Integer.valueOf(obj1.charAt(obj1.length()-1)).compareTo(Integer.valueOf(obj2.charAt(obj2.length()-1))))
        //                          .map(obj -> Integer.valueOf(obj))
        //                          .toList();
        
        // sorting based on unit place digits
        List<Integer> nums = list.stream()
                                 .map(obj -> String.valueOf(obj))
                                 .sorted((obj1, obj2) -> Integer.valueOf(obj1.charAt(obj1.length()-1)) - Integer.valueOf(obj2.charAt(obj2.length()-1)))
                                 .map(obj -> Integer.valueOf(obj))
                                 .toList();

        return nums;
    }
}
