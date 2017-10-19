package me.motyim.codility.lesson5;

import me.motyim.codility.lesson5.CountDiv;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 16-Oct-17.
 */
public class CountDivTest {

    @Test
    public void testCase1(){
        assertEquals(3,new CountDiv().solution(6, 11, 2));
    }

    @Test
    public void testCase2(){
        assertEquals(6,new CountDiv().solution(6, 11, 1));
    }

    @Test
    public void testCase3(){
        assertEquals(2,new CountDiv().solution(6, 11, 3));
    }

    @Test
    public void testCase4(){
        assertEquals(1,new CountDiv().solution(6, 11, 9));
    }


}