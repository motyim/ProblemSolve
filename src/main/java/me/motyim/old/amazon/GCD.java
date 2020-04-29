package me.motyim.old.amazon;

import java.util.stream.IntStream;

public class GCD {
    public static int generalizedGCD(int arr[])
    {
        int max = IntStream.of(arr).max().getAsInt();

        while(max-->0){
            boolean flag  = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%max!=0){
                    flag=false;
                    break;
                }
            }
            if(flag) break;
        }
        return max;
    }
}
