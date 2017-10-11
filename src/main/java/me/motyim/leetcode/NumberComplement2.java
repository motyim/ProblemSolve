package me.motyim.leetcode;

/**
 * link : https://leetcode.com/problems/number-complement/
 * Created by MotYim on 09-Oct-17.
 */
public class NumberComplement2 {

    public int findComplement(int num) {
        int m = Integer.highestOneBit(num);
        int i =  m << 1;
        i--;
        int x = ~num & i ;
        return x;
    }

}
