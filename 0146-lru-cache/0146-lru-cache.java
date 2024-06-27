// class LRUCache {

//     public LRUCache(int capacity) {
        
//     }
    
//     public int get(int key) {
        
//     }
    
//     public void put(int key, int value) {
        
//     }
// }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

  // import java.util.LinkedHashMap;
  //   public class LRUCache {
  //       private LinkedHashMap<Integer, Integer> map;
  //       private final int CAPACITY;
  //       public LRUCache(int capacity) {
  //           CAPACITY = capacity;
  //           map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
  //               protected boolean removeEldestEntry(Map.Entry eldest) {
  //                   return size() > CAPACITY;
  //               }
  //           };
  //       }
  //       public int get(int key) {
  //           return map.getOrDefault(key, -1);
  //       }
  //       public void set(int key, int value) {
  //           map.put(key, value);
  //       }
  //   }




import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;

    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > CAPACITY;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) { // Updated method name from 'set' to 'put'
        map.put(key, value);
    }
}
