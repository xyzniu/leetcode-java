package com.xyzniu.leetcode.hashtable;

import java.util.*;

/**
 * 690
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class EmployeeImportance {
    
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            map.put(e.id, e);
        }
        
        int importance = 0;
        Queue<Integer> ids = new LinkedList<>();
        ids.offer(id);
        while (!ids.isEmpty()) {
            int one = ids.poll();
            Employee e = map.get(one);
            importance += e.importance;
            List<Integer> nexts = e.subordinates;
            for (int i = 0; i < nexts.size(); i++) {
                ids.offer(nexts.get(i));
            }
        }
        return importance;
    }
    
}
