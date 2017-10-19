package me.motyim.codility.lesson2;

import me.motyim.codility.lesson2.OddOccurrencesInArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MotYim on 13-Oct-17.
 */
public class OddOccurrencesInArrayTest {

    @Test
    public void testCase1(){
        assertEquals(7 , new OddOccurrencesInArray().solution3(new int []{9,3,9,3,9,7,9}));
    }

}