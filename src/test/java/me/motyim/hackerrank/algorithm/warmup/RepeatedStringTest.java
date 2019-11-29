package me.motyim.hackerrank.algorithm.warmup;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void sampleCase0() {
        long result = RepeatedString.repeatedString("abcac", 10);
        assertEquals(4, result);
    }

    @Test
    public void sampleCase1() {
        long result = RepeatedString.repeatedString("aba", 10);
        assertEquals(7, result);
    }

    @Test
    public void sampleCase2() {
        long result = RepeatedString.repeatedString("a", 1000000000000L);
        assertEquals(1000000000000L, result);
    }

    @Test
    public void sampleCase14() {
        long result = RepeatedString
                .repeatedString("aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa",
                        942885108885L);
        assertEquals(330009788107L, result);
    }

    @Test
    public void sampleCase4() {
        long result = RepeatedString
                .repeatedString("gfcaaaecbg",
                        547602);
        assertEquals(164280, result);
    }

}