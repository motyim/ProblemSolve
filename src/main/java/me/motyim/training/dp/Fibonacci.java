package me.motyim.training.dp;

public class Fibonacci {


    public long calculate(int x){
        return calHelper(x,new int[x+1]);
    }

    private int calHelper(int x , int [] memo){
        if(x == 0 || x == 1) return 1;
        else if(memo[x] == 0) memo[x] = calHelper(x-1,memo) + calHelper(x-2,memo);
        return memo[x];
    }

}
