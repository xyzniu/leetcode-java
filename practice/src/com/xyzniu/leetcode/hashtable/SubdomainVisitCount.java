package com.xyzniu.leetcode.hashtable;

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
        for (String domain : cpdomains) {
            String[] s = domain.split(" ");
            int num = Integer.parseInt(s[0]);
            addMap(s[1], map, num);
        }
        List<String> rst = new ArrayList<>();
        for (String s : map.keySet()) {
            String ss = map.get(s) + " " + s;
            rst.add(ss);
        }
        return rst;
    }

    private void addMap(String domain, HashMap<String, Integer> map, int num) {
        map.put(domain, map.getOrDefault(domain, 0) + num);
        if (domain.contains(".")) {
            addMap(domain.substring(domain.indexOf('.')), map, num);
        }
    }

}
