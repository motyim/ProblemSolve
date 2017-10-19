package me.motyim.codility.lesson4;

import me.motyim.codility.lesson4.PermCheck;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 14-Oct-17.
 */
public class PermCheckTest {

    @Test
    public void testCase1(){
        assertEquals(1 , new PermCheck().solution(new int [] {4,1,3,2}));
    }

    @Test
    public void testCase2(){
        assertEquals(0 , new PermCheck().solution(new int [] {4,1,3}));
    }

    @Test
    public void testCase3(){
        assertEquals(0 , new PermCheck().solution(new int [] {0,3,3}));
    }

}