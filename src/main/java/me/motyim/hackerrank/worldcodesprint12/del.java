package me.motyim.hackerrank.worldcodesprint12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 14-Dec-17
 */
public class del {
    public static void main(String[] args) {

        ArrayList<Long> longs = allFactors(25);
        longs.stream().forEach(a-> System.out.println(a));

    }

    public static ArrayList<Long> allFactors(long a) {

        long upperlimit = (long)(Math.sqrt(a));
        ArrayList<Long> factors = new ArrayList<>();
        for(long i=1;i <= upperlimit; i+= 1){
            if(a%i == 0){
                factors.add(i);
                if(i != a/i){
                    factors.add(a/i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }
}
