package me.motyim.codility;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 13-Oct-17.
 */
public class CyclicRotationTest {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int [] {6, 3, 8, 9, 7} , new CyclicRotation().solution(new int []{3, 8, 9, 7, 6} ,1));
    }


    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int [] {9, 7, 6, 3, 8} , new CyclicRotation().solution(new int []{3, 8, 9, 7, 6} ,3));
    }

    @Test
    public void testCase3(){
        Assert.assertArrayEquals(new int [] {9, 7, 6, 3, 8} , new CyclicRotation().solution(new int []{3, 8, 9, 7, 6} ,8));
    }
}