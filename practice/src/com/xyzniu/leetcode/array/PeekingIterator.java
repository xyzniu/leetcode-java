package com.xyzniu.leetcode.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 284
 */
public class PeekingIterator implements Iterator<Integer> {
    
    private List<Integer> list;
    private int index;
    
    public PeekingIterator(Iterator<Integer> iterator) {
        list = new ArrayList<>();
        index = 0;
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(index);
    }
    
    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return list.get(index++);
    }
    
    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}