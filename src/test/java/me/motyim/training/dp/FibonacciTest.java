package me.motyim.training.dp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void test0(){
        assertEquals(1,new Fibonacci().calculate(0));
    }

    @Test
    public void test1(){
        assertEquals(1,new Fibonacci().calculate(1));
    }

    @Test
    public void test2(){
        assertEquals(2,new Fibonacci().calculate(2));
    }

    @Test
    public void test10(){
        assertEquals(89,new Fibonacci().calculate(10));
    }
}