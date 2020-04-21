package com.xyzniu.leetcode;

public class SortString {
    
    public String sortString(String s) {
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        
        StringBuffer sb = new StringBuffer();
        while (sb.length() < s.length()) {
            chooseSmallest(sb, alphabet);
            chooseLargest(sb, alphabet);
        }
        return sb.toString();
    }
    
    private void chooseLargest(StringBuffer sb, int[] alphabet) {
        for (int i = alphabet.length - 1; i >= 0; i--) {
            if (alphabet[i] > 0) {
                sb.append((char) ('a' + i));
                alphabet[i]--;
                break;
            }
        }
    }
    
    private void chooseSmallest(StringBuffer sb, int[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0) {
                sb.append((char) ('a' + i));
                alphabet[i]--;
                break;
            }
        }
    }
    
}
