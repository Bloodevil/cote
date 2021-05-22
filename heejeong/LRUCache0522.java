package heejeong;

import java.util.*;

public class LRUCache0522 {
    // 146. LRU Cache
    // Time Limit Exceeded
    // Doubled Linked list 구현해서 재시도하기
}

class LRUCache {
    private Map<Integer, Integer> cache;
    private List<Integer> lru = new LinkedList<>();
    private int capacity;

    // Initialize the LRU cache
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
    }

    // Return the value of the key if the key exists
    public int get(int key) {
        lru.add(key);
        if(!cache.isEmpty() && cache.get(key) != null){
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        // evict the least recently used key.
        if(cache.size() == capacity && cache.get(key) == null){
            int minIdx = lru.size() - 1;
            for (int lruKey : cache.keySet()){
                minIdx = Math.min(minIdx, lru.lastIndexOf(lruKey));
            }
            int lruKey = lru.get(minIdx);
            cache.remove(lruKey);
        }

        cache.put(key, value);
        lru.add(key);
    }
}

/*
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
*/
