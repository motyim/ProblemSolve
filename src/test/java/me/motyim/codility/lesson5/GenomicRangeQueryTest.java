package me.motyim.codility.lesson5;

import me.motyim.codility.lesson5.GenomicRangeQuery;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 17-Oct-17.
 */
public class GenomicRangeQueryTest {

    @Test
    public void testCase1(){
        String s ="CAGCCTA" ;
        int [] p = {2,5,0};
        int [] q = {4,5,6} ;
        assertArrayEquals(new int []{2, 4, 1} , new GenomicRangeQuery().solution3( s, p ,q));
    }

}