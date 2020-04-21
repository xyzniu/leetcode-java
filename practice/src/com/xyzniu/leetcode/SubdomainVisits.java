package com.xyzniu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisits {
    
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : cpdomains) {
            String[] strs = str.split(" ");
            int count = Integer.valueOf(strs[0]);
            String subdomain = strs[1];
            while (true) {
                map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                subdomain = subdomain.substring(subdomain.indexOf(".") + 1);
                if (!subdomain.contains(".")) {
                    map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                    break;
                }
            }
        }
        
        List<String> rst = new ArrayList<>();
        for (String str : map.keySet()) {
            rst.add(map.get(str) + " " + str);
        }
        return rst;
    }
    
    
}
