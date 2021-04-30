
/*
Referrence By :
http://infotechgems.blogspot.com/2011/11/java-collections-performance-time.html
-----------------------------------------------------------
#List
Class Name|	Add	Remove	Get	Contains
ArrayList	O(1)	O(n)	O(1)	O(n)
LinkedList	O(1)	O(1)	O(n)	O(n)
-----------------------------------------------------------
#Set
Class Name|	Add	Contains	Next
HashSet	O(1)	O(1)	O(h/n)
LinkedHashSet	O(1)	O(1)	O(1)
EnumSet	O(1)	O(1)	O(1)
TreeSet	O(log n)	O(log n)	O(log n)
-----------------------------------------------------------
#Queue
Class Name|	Offer	Peak	Poll	Size
PriorityQueue	O(log n)	O(1)	O(log n)	O(1)
LinkedList	O(1)	O(1)	O(1)	O(1)
ArrayDequeue	O(1)	O(1)	O(1)	O(1)
DelayQueue	O(log n)	O(1)	O(log n)	O(1)
-----------------------------------------------------------
#Map
Class Name|	Get	ContainsKey	Next
HashMap	O(1)	O(1)	O(h/n)
LinkedHashMap	O(1)	O(1)	O(1)
WeakHashMap	O(1)	O(1)	O(h/n)
EnumMap	O(1)	O(1)	O(1)
TreeMap	O(log n)	O(log n)	O(log n)
-----------------------------------------------------------

*/
class Solution {
    public boolean isHappy(int n) {
        //CopyOnWriteArraySet<Integer> happyCollection = new CopyOnWriteArraySet<Integer>();
        //happyCollection.add(n);
        // HashMap map = new HashMap<Integer, Integer>();
        // map.put(n, null);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(n);

        while(n != 1){
            n = getprocessingNumber(n);
            if(hashSet.contains(n)) {
                return false;
            }
            else{
                hashSet.add(n);
            }
        }
        return true;
    }

    public int getprocessingNumber (int n){
        int number = 0;

        while(n > 0){
            number += Math.pow((n % 10),2);
            n = n / 10;
        }
        return number;
    }
}