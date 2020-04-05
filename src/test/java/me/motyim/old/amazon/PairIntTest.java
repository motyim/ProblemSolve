package me.motyim.old.amazon;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PairIntTest {

    @Test
    public void testCase1(){
        MyPair obj = new MyPair();
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(Arrays.asList(-3,1,31,40));
        lists.add(Arrays.asList(10,33,40,660));
        lists.add(Arrays.asList(22,43,161,702));

        PairInt pairInt = obj.locationOfTargetValue(3, 4, lists, 3);
        assertEquals(-1,pairInt.first);
        assertEquals(-1,pairInt.second);
    }

    @Test
    public void testCase2(){
        MyPair obj = new MyPair();
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(Arrays.asList(-3,1,31,40));
        lists.add(Arrays.asList(10,33,40,660));
        lists.add(Arrays.asList(22,43,161,702));

        PairInt pairInt = obj.locationOfTargetValue(3, 4, lists, 22);
        assertEquals(2,pairInt.first);
        assertEquals(0,pairInt.second);
    }
}