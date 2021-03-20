import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

// https://www.baeldung.com/java-hashmap-sort
public class cote0318_quiz_sortedHashmap{
    public static void main(String[] args) {
        HashMap<Integer, Integer> unSortedMap = new HashMap<Integer, Integer>();
        unSortedMap.put(1, 1);
        unSortedMap.put(5, 3);
        unSortedMap.put(2, 6);
        unSortedMap.put(4, 14);
        SortHashMap(unSortedMap);
        System.out.println(unSortedMap);
        return;
    }

    /*
        0318 assignment 

    */

    //TreeMap
    public static HashMap<Integer, Integer> SortHashMap2(HashMap<Integer, Integer> hashmap) {
        TreeMap<Integer, Integer> sorted = new TreeMap<>(hashmap);
        
        //other way using putAll() method
        //TreeMap<Integer, Integer> sorted = new TreeMap<>();
        //sorted.putAll(hashmap);
        
        System.out.println(sorted);
        return hashmap;
    }

    //ArrayList
    public static HashMap<Integer, Integer> SortHashMap(HashMap<Integer, Integer> hashmap) {
        List<Integer> mapByKey = new ArrayList<>(hashmap.keySet());
        Collections.sort(mapByKey);
        System.out.println(mapByKey);
        return hashmap;
    }

    
}
