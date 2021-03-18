package heejeong;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortHashMap0318 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> unSortedMap = new HashMap<>();
        unSortedMap.put(1, 1);
        unSortedMap.put(5, 3);
        //요소 추가
        unSortedMap.put(2, 6);
        SortHashMap(unSortedMap);
    }

    public static HashMap<Integer, Integer> SortHashMap(HashMap<Integer, Integer> hashmap) {
        //let's sort

        //1. sort by key - TreeMap (Key 기준으로 오름차순 정렬)
        TreeMap<Integer, Integer> sortByKeys = new TreeMap<>();
        sortByKeys.putAll(hashmap);
        System.out.println("sort by key = "+sortByKeys);

        //2. sort by value - Using the Stream API (Value 기준으로 오름차순 정렬)
        hashmap = hashmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue,newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("sort by values = "+hashmap);

        return hashmap;
    }
}
