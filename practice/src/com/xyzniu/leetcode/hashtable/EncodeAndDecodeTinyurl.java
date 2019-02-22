package com.xyzniu.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 535
 */
public class EncodeAndDecodeTinyurl {

    class Codec {
        private HashMap<String, String> map = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String hash = String.valueOf(longUrl.hashCode());
            map.put(hash, longUrl);
            return hash;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }
    }

}
