import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// https://www.baeldung.com/java-hashmap-sort
public class Solution{
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> unSortedMap = new HashMap<Integer, Integer>();
        unSortedMap.put(1, 1);
        unSortedMap.put(5, 3);
        SortHashMap(unSortedMap);
        return;
    }

    public static HashMap<Integer, Integer> SortHashMap(HashMap<Integer, Integer> hashmap) {
        //let's sort
        System.out.println(hashmap);
        return hashmap;
    }
}
