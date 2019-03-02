package com.xyzniu.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 937
 */
public class ReorderLogFiles {

    /**
     * 你有一个日志数组 logs。每条日志都是以空格分隔的字串。
     * 对于每条日志，其第一个字为字母数字标识符。然后，要么：
     * 标识符后面的每个字将仅由小写字母组成，或；
     * 标识符后面的每个字将仅由数字组成。
     * 我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
     * 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，标识符仅用于表示关系。数字日志应该按原来的顺序排列。
     * 返回日志的最终顺序。
     *
     * @param logs
     * @return
     */
    public String[] reorderLogFiles(String[] logs) {
        List<String> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            char c = logs[i].charAt(logs[i].indexOf(" ") + 1);
            if (c >= 'a' && c <= 'z') {
                strings.add(logs[i]);
            } else {
                integers.add(logs[i]);
            }
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index1 = o1.indexOf(" ") + 1;
                int index2 = o2.indexOf(" ") + 1;
                while (index1 < o1.length() && index2 < o2.length()) {
                    if (o1.charAt(index1) == o2.charAt(index2)) {
                        index1++;
                        index2++;
                    } else {
                        return o1.charAt(index1) - o2.charAt(index2);
                    }
                }
                return 1;
            }
        });

        int index = 0;

        for (int i = 0; i < strings.size(); i++) {
            logs[index++] = strings.get(i);
        }
        for (int i = 0; i < integers.size(); i++) {
            logs[index++] = integers.get(i);
        }
        return logs;
    }

}
