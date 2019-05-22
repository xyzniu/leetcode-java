package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * 705
 */
public class DesignHashset {

}

class MyHashSet {
    
    private List<Integer>[] list;
    
    public MyHashSet() {
        list = new ArrayList[30007];
    }
    
    public void add(int key) {
        int key2 = key % 30007;
        if (list[key2] == null) {
            list[key2] = new ArrayList<>();
        }
        if (!contains(key2)) {
            list[key2].add(key);
        }
    }
    
    public void remove(int key) {
        int key2 = key % 30007;
        if (list[key2] != null) {
            list[key2].remove((Integer) key);
        }
    }
    
    public boolean contains(int key) {
        int key2 = key % 30007;
        return list[key2] != null && list[key2].contains(key);
    }
}
