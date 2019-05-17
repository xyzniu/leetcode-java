package com.xyzniu.leetcode.math;

import java.util.HashSet;
import java.util.Iterator;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    
    
    HashSet<Integer> primes = new HashSet<>();
    int max = 11;
    
    public int countPrimeSetBits(int L, int R) {
        int sum = 0;
        initPrime();
        for (int i = L; i <= R; i++) {
            sum += isPrime(i);
        }
        return sum;
    }
    
    private int isPrime(int num) {
        String str1 = Integer.toBinaryString(num);
        String str2 = str1.replace("1", "");
        num = str1.length() - str2.length();
        if (max < num) {
            addPrime(num);
        }
        if (primes.contains(num)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private void addPrime(int num) {
        for (int i = max + 1; i <= num; i++) {
            Iterator it = primes.iterator();
            boolean flag = true;
            while (it.hasNext()) {
                if (i % (int) (it.next()) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primes.add(i);
            }
        }
        max = num;
    }
    
    private void initPrime() {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
    }
    
    
}

