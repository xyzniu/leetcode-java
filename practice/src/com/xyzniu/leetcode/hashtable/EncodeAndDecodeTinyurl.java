package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * 535
 */
public class EncodeAndDecodeTinyurl {
    
    String str = "1234567890qwertyuiopasdfghjklzxcvbnm";
    HashMap<String, String> longToShort = new HashMap<>();
    HashMap<String, String> shortToLong = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }
        String shortUrl = null;
        do {
            shortUrl = getEncoded();
        } while (shortToLong.containsKey(shortUrl));
        longToShort.put(longUrl, shortUrl);
        shortToLong.put(shortUrl, longUrl);
        return shortUrl;
    }
    
    private String getEncoded() {
        Random r = new Random();
        StringBuffer sb = new StringBuffer("http://tinyurl.com/");
        for (int i = 0; i < 6; i++) {
            int temp = r.nextInt(str.length());
            sb.append(str.charAt(temp));
        }
        return sb.toString();
    }
    
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
    
}
