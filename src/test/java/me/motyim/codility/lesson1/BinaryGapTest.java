package me.motyim.codility.lesson1;

import me.motyim.codility.lesson1.BinaryGap;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 13-Oct-17.
 */
public class BinaryGapTest {
    @Test
    public void testCase1(){
      assertEquals(5,new BinaryGap().solution(1041 ));
    }

    @Test
    public void testCase2(){
      assertEquals(2,new BinaryGap().solution(9 ));
    }

    @Test
    public void testCase3(){
      assertEquals(0,new BinaryGap().solution(15  ));
    }
    @Test
    public void testCase4(){
      assertEquals(3,new BinaryGap().solution(561892  ));
    }

    @Test
    public void testCase5(){
      assertEquals(4,new BinaryGap().solution(74901729  ));
    }
}