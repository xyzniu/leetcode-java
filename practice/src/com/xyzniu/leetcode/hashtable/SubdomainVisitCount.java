package com.xyzniu.leetcode.hashtable;

import com.xyzniu.leetcode.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 811
 */
public class SubdomainVisitCount {
    
    /**
     * 一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
     * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com"。
     * 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
     *
     * @param cpdomains
     * @return
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] strings = cpdomains[i].split(" ");
            count(map, Integer.parseInt(strings[0]), strings[1]);
        }
        List<String> rst = new ArrayList<>();
        for (String str : map.keySet()) {
            rst.add(map.get(str) + " " + str);
        }
        return rst;
    }
    
    private void count(HashMap<String, Integer> map, int count, String domain) {
        while (domain.length() > 0) {
            map.put(domain, map.getOrDefault(domain, 0) + count);
            if (domain.indexOf(".") > 0) {
                domain = domain.substring(domain.indexOf(".") + 1);
            } else {
                break;
            }
        }
    }
    
    
}
