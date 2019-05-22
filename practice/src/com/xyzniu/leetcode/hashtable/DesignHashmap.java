package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;

/**
 * 706
 */
public class DesignHashmap {
}

class MyHashMap {
    
    private ArrayList[] keys;
    private ArrayList[] values;
    
    public MyHashMap() {
        keys = new ArrayList[30007];
        values = new ArrayList[30007];
    }
    
    public void put(int key, int value) {
        int k = key % 30007;
        if (keys[k] == null) {
            keys[k] = new ArrayList();
            keys[k].add(key);
            values[k] = new ArrayList();
            values[k].add(value);
        } else {
            if (keys[k].contains(key)) {
                int i = keys[k].indexOf(key);
                values[k].set(i, value);
            } else {
                keys[k].add(key);
                values[k].add(value);
            }
        }
    }
    
    public int get(int key) {
        int k = key % 30007;
        if (!contains(key)) {
            return -1;
        }
        int i = keys[k].indexOf(key);
        return (int) values[k].get(i);
    }
    
    public void remove(int key) {
        int k = key % 30007;
        if (!contains(key)) {
            return;
        }
        int i = keys[k].indexOf(key);
        keys[k].remove(i);
        values[k].remove(i);
    }
    
    private boolean contains(int key) {
        int k = key % 30007;
        if (keys[k] == null || !keys[k].contains(key)) {
            return false;
        } else {
            return true;
        }
    }
}
