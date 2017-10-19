package me.motyim.codility.lesson5;

import me.motyim.codility.lesson5.PassingCars;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 16-Oct-17.
 */
public class PassingCarsTest {

    @Test
    public void testCase1(){
        assertEquals(5 , new PassingCars().solution(new int [] {0,1,0,1,1}));
    }


    @Test
    public void testCase2(){
        assertEquals(0 , new PassingCars().solution(new int [] {0,0}));
    }



    @Test
    public void testCase3(){
        assertEquals(0 , new PassingCars().solution(new int [] {1,1}));
    }



    @Test
    public void testCase4(){
        assertEquals(1 , new PassingCars().solution(new int [] {0,1}));
    }

    @Test
    public void testCase5(){
        assertEquals(0 , new PassingCars().solution(new int [] {1,0}));
    }

    @Test
    public void testCase6(){
        assertEquals(6 , new PassingCars().solution(new int [] {0,0,1,1,1,0}));
    }


    @Test
    public void testCase7(){
        assertEquals(5 , new PassingCars().solution(new int [] {0,1,0,1,1,0}));
    }
}
