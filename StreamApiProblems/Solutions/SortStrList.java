package Solutions;

import java.util.Comparator;
import java.util.List;
public class SortStrList {
    
    public List<String> getSortedStrList(List<String> list){

        List<String> strList = list.stream().sorted(Comparator.comparing(String::toLowerCase)).toList();
        return strList;
    }
}
