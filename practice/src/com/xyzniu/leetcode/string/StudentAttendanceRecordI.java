package com.xyzniu.leetcode.string;

/**
 * 551
 */
public class StudentAttendanceRecordI {
    
    public boolean checkRecord(String s) {
        if (s.indexOf("LLL") >= 0) {
            return false;
        }
        int size = s.length();
        int sizeNoAbsent = s.replace("A", "").length();
        if (size - sizeNoAbsent > 1) {
            return false;
        }
        return true;
    }
    
}
