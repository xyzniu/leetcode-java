package com.xyzniu.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 937
 */
public class ReorderLogFiles {
    
    
    private String[] reorderedLogs;
    private String[] letterLogs;
    private String[] digitLogs;
    private int digitLogIndex;
    private int letterLogLength;
    
    public String[] reorderLogFiles(String[] logs) {
        
        reorderedLogs = new String[logs.length];
        letterLogs = new String[logs.length];
        digitLogs = new String[logs.length];
        
        digitLogIndex = 0;
        letterLogLength = 0;
        
        for (int i = 0; i < logs.length; i++) {
            if (isDigitLog(logs[i])) {
                digitLogs[digitLogIndex++] = logs[i];
            } else {
                insertLetterLogs(logs[i]);
            }
        }
        
        appendLogs();
        return reorderedLogs;
    }
    
    private void appendLogs() {
        int index = 0;
        for (int i = 0; i < letterLogLength; i++) {
            reorderedLogs[index++] = letterLogs[i];
        }
        for (int i = 0; i < digitLogIndex; i++) {
            reorderedLogs[index++] = digitLogs[i];
        }
    }
    
    private void insertLetterLogs(String log) {
        for (int i = 0; i < letterLogLength; i++) {
            if (!compare(letterLogs[i], log)) {
                String temp = letterLogs[i];
                letterLogs[i] = log;
                log = temp;
            }
        }
        letterLogs[letterLogLength++] = log;
    }
    
    private boolean compare(String log1, String log2) {
        int index1 = log1.indexOf(" ") + 1;
        int index2 = log2.indexOf(" ") + 1;
        while (index1 < log1.length() && index2 < log2.length()) {
            char c1 = log1.charAt(index1++);
            char c2 = log2.charAt(index2++);
            if (c1 < c2) {
                return true;
            } else if (c1 > c2) {
                return false;
            }
        }
        if (index1 != log1.length()) {
            return false;
        } else if (index2 != log2.length()) {
            return true;
        } else {
            int identifier1 = 0;
            int identifier2 = 0;
            index1 = log1.indexOf(" ");
            index2 = log2.indexOf(" ");
            while (identifier1 < index1 && identifier2 < index2) {
                char c1 = log1.charAt(identifier1++);
                char c2 = log2.charAt(identifier2++);
                if (c1 < c2) {
                    return true;
                } else if (c1 > c2) {
                    return false;
                }
            }
            return identifier1 == index1;
        }
    }
    
    private boolean isDigitLog(String log) {
        char c = log.charAt(log.indexOf(" ") + 1);
        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }
    }
    
}
