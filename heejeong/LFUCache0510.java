package heejeong;

import java.util.*;

public class LFUCache0510 {
    /*
    460. LFU Cache
    실패 테스트케이스
        ["LFUCache","put","put","get","get","put","get","get","get"]
        [[2],[2,1],[3,2],[3],[2],[4,3],[2],[3],[4]]
    이유 user counter가 같은 경우 사용된지가 오래된 key를 삭제해야하는데,
        나는 먼저 생성된 키가 삭제되어서 테스트케이스를 통과하지 못한 것.
    */
}

class LFUCache {
    private Map<Integer, Integer> cache;	    // key, value
    private Map<Integer, Integer> counter;	    // key, counter
    private int capacity;

    public LFUCache(int capacity) {
        // Initializes the object with the capacity of the data structure.
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        counter = new HashMap<>(capacity);
    }

    public int get(int key) {
        // return value of key if the key exists in the cache or return -1
        // System.out.println("this time key is? "+key);
        // System.out.println("now cache contains this key? "+cache.containsKey(key));

        if (cache.containsKey(key)){
            counter.put(key, counter.get(key)+1);
            // System.out.println("now this value of key("+key+") = "+cache.get(key));
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (capacity != 0){
            // 캐시가 capacity에 도달하면, 가장 적게 사용된 키를 삭제함 (use counter가 적은 key)
            // inserting a new item
            if (!cache.containsKey(key) && cache.size() == capacity){
                // when there is a tie, invalidate lru key
                int min = Collections.min(counter.entrySet(), Map.Entry.comparingByValue()).getValue();
                System.out.println("min = "+min);

                // else invalidate lfu key
                int lfuKey = Collections.min(counter.entrySet(), Map.Entry.comparingByValue()).getKey();
                // System.out.println("Lfu : "+lfuKey);
                cache.remove(lfuKey);
                counter.remove(lfuKey);
                // System.out.println("delete "+lfuKey+" from the cache! contains key?"+cache.containsKey(lfuKey));
            }
            // Update the value of the key if present
            // or inserts the key if not already present
            // insert되면 user counter : 1로 세팅
            // System.out.println("now key = "+key);
            cache.put(key, value);
            if (counter.containsKey(key)){
                counter.put(key, counter.get(key)+1);
            } else {
                counter.put(key, 1);
            }
            // System.out.println("now cache !? "+cache);
        }
    }
}

/*
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */