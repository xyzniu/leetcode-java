package com.xyzniu.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1002
 */
public class FindCommonCharacters {
    
    public List<String> commonChars(String[] A) {
        HashMap<Character, Integer> map = new HashMap<>();
        createMap(map, A[0]);
        
        for (int i = 1; i < A.length; i++) {
            addMap(map, A[i]);
        }
        
        List<String> strings = new ArrayList<>();
        for (char key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                strings.add(String.valueOf(key));
            }
        }
        return strings;
    }
    
    private void addMap(HashMap<Character, Integer> map, String s) {
        HashMap<Character, Integer> mapnew = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapnew.put(s.charAt(i), mapnew.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (char key : map.keySet()) {
            if (!mapnew.containsKey(key)) {
                map.put(key, 0);
            } else {
                map.put(key, Math.min(map.get(key), mapnew.get(key)));
            }
        }
    }
    
    private void createMap(HashMap<Character, Integer> map, String s) {
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
    }
    
    
}
