package com.example.emantrana.DSA.DP;

import java.util.HashMap;
import java.util.Map;
public class Fibonacci {
    private Map<Integer, Integer> map = new HashMap<>();
    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public  int fibMemo(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int f;

        if (n <= 1) {
            f = n;
        } else {
            f = fibMemo(n - 1) + fibMemo(n - 2);
            map.put(n, f);
        }
        return f;
    }

    public  int fibBotUp(int n) {
        Map<Integer, Integer> fib = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            int f;
            if (i <= 1) {
                f = i;
            } else {
                f = fib.get(i - 1) + fib.get(i - 2);
            }
            fib.put(i, f);
        }

        return fib.get(n);
    }

    public  int fibOptimized(int n) {
        if (n == 0) {
            return 0;
        }
        int prev = 0, res = 1, next;
        for (int i = 2; i <= n; i++) {
            next = prev + res;
            prev = res;
            res = next;
        }
        return res;
    }


    public  int fibBinet(int n) {
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5) / 2;
        int nthTerm = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / squareRootOf5);
        return nthTerm;
    }
}
