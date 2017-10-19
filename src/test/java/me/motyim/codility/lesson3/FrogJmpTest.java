package me.motyim.codility.lesson3;

import me.motyim.codility.lesson3.FrogJmp;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 13-Oct-17.
 */
public class FrogJmpTest {

    @Test
    public void testCase(){
        assertEquals(3 , new FrogJmp().solution2(10,85,30));
    }
}