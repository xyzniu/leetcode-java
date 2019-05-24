package com.xyzniu.leetcode.math;


import java.util.HashMap;
import java.util.HashSet;

/**
 * 860
 */
public class LemonadeChange {
    private HashMap<Integer, Integer> map = new HashMap<>();
    private final int FIVE = 5;
    private final int TEN = 10;
    private final int TWENTY = 20;
    
    public boolean lemonadeChange(int[] bills) {
        map.put(FIVE, 0);
        map.put(TEN, 0);
        map.put(TWENTY, 0);
        for (int i = 0; i < bills.length; i++) {
            if (!change(bills[i])) {
                return false;
            }
        }
        return true;
    }
    
    private boolean change(int bill) {
        switch (bill) {
            case FIVE:
                map.put(FIVE, map.get(FIVE) + 1);
                break;
            case TEN:
                if (map.get(FIVE) <= 0) {
                    return false;
                } else {
                    map.put(FIVE, map.get(FIVE) - 1);
                    map.put(TEN, map.get(TEN) + 1);
                }
                break;
            case TWENTY:
                if (map.get(TEN) > 0 && map.get(FIVE) > 0) {
                    map.put(FIVE, map.get(FIVE) - 1);
                    map.put(TEN, map.get(TEN) - 1);
                    map.put(TWENTY, map.get(TWENTY) + 1);
                } else if (map.get(FIVE) >= 3) {
                    map.put(FIVE, map.get(FIVE) - 3);
                    map.put(TWENTY, map.get(TWENTY) + 1);
                } else {
                    return false;
                }
        }
        return true;
    }
    
}
