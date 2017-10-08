package me.motyim.leetcode;

/**
 * link : https://leetcode.com/problems/number-complement/
 * Created by MotYim on 08-Oct-17.
 */
public class NumberComplement {

    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        bin = bin.replaceAll("0","2");
        bin = bin.replaceAll("1","0");
        bin = bin.replaceAll("2","1");
        return Integer.parseInt(bin,2) ;
    }
}
