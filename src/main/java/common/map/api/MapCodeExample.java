package common.map.api;

import java.util.*;

public class MapCodeExample {

    private Map<String, String> hashmap;
    private SortedMap<Integer, String> sortedMap;
    private TreeMap<Integer, String> treeMap;

    public MapCodeExample(){
        this.hashmap = new HashMap();
        hashmap.put("key1", "element 1");
        hashmap.put("key2", "element 2");
        hashmap.put("key3", "element 3");

        Comparator<Integer> comparator = (a,b) -> {
            int r = Integer.compare(a, b);
            if (r != 0) {
                return r;
            }
            return a - b;
        };

        this.sortedMap = new TreeMap(comparator);
        sortedMap.put(1, "element 1");
        sortedMap.put(2, "element 2");
        sortedMap.put(3, "element 3");

        treeMap.put(1003, "Rajeev");
        treeMap.put(1001, "James");
        treeMap.put(1002, "Sachin");
        treeMap.put(1004, "Chris");
    }

    public void runHashMapMethods() {
        if (hashmap.containsKey("key1")) {
            String key1Val = (String) hashmap.get("key1");
        }

        if (!hashmap.isEmpty()) {
            hashmap.forEach((key, value) -> System.out.println(key));
            Iterator<Map.Entry<String, String>> mapItr = hashmap.entrySet().iterator();
            while (mapItr.hasNext()) {
                Map.Entry<String, String> entry = mapItr.next();
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }

            for (String val : hashmap.values()) {
                System.out.println(val);
            }
        }

        if (hashmap.containsKey("key1")) {
            hashmap.remove("key1");
        }

        hashmap.clear();
    }

    public void runSotedMapMethods() {
        // Returns the first (lowest) key currently in this map
        int smallestKey = sortedMap.firstKey();
        // Returns the last (highest) key currently in this map
        int largestKey = sortedMap.lastKey();
        // sub map whose keys are strictly less than toKey
        sortedMap.headMap(2);
        // map whose keys are greater than or equal to fromKey
        sortedMap.tailMap(2);
        // map whose keys range from fromKey, inclusive, to toKey, exclusive
        sortedMap.subMap(2, 3);
    }

    public void runTreeMapMethods() {
        // Returns a key-value mapping associated with the least key greater than or
        // equal to the given key, or null if there is no such key.
        treeMap.ceilingEntry(1000);
        // Returns the least key greater than or equal to the given key, or null if there is no such key
        treeMap.ceilingKey(1000);
        // Returns a key-value mapping associated with the greatest key less than or
        // equal to the given key, or null if there is no such key
        treeMap.floorEntry(2000);
        // Returns the greatest key less than or equal to the given key, or null if there is no such key.
        treeMap.floorKey(2000);
    }
}
