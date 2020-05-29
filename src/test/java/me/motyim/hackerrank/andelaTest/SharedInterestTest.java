package me.motyim.hackerrank.andelaTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SharedInterestTest {

    @Test
    public void testCase0(){

        List friendsFrom = Arrays.asList(1,1,2,2,2);
        List friendsTo = Arrays.asList(2,2,3,3,4);
        List cost = Arrays.asList(1,2,1,3,3);
        int res = SharedInterest.maxShared(4, friendsFrom, friendsTo, cost);
        assertEquals(6,res);
    }


    @Test
    public void testCase3(){

        List friendsFrom = Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);
        List friendsTo = Arrays.asList(2, 3, 3, 3, 4, 1, 1, 1, 1, 3, 4, 4, 1, 1, 1, 1, 1, 1, 2, 2, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3);
        List cost = Arrays.asList(72, 8, 34, 45, 77, 3, 48, 64, 71, 18, 29, 77, 3, 23, 27, 42, 46, 65, 5, 43, 64, 66, 93, 2, 11, 30, 41, 60, 75, 94, 43, 65, 76, 91, 22, 24, 79);
        int res = SharedInterest.maxShared(4, friendsFrom, friendsTo, cost);
        assertEquals(3,res);


    }

}