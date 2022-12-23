package me.motyim.hackerrank.algorithm.dynamic;

import java.util.*;

/***
 * <a href="https://www.hackerrank.com/challenges/coin-change/problem">Problem</a>
 */
public class CoinChange {
    public static long getWays(int n, List<Integer> c) {
        return getWays(n,c,0,new HashMap<>());
    }

    private static long getWays(int money, List<Integer> coins, int idx,Map<String,Long> memo) {
        if(money == 0) return 1; // that the solution that coins get money to zero
        if(idx >= coins.size()) return 0;

        long ways = 0 ;

        long amonutWithCoin = 0;

        String key = money+"_"+coins.get(idx);

        if(!memo.containsKey(key)){
            while(amonutWithCoin <= money){
                long remaingMoney = money - amonutWithCoin;
                ways+= getWays((int) remaingMoney,coins,idx+1,memo);
                amonutWithCoin += coins.get(idx);
            }
            memo.put(key,ways);
        }
        return memo.get(key);
    }

}
