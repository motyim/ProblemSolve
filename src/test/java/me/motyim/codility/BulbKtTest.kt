package me.motyim.codility

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BulbKtTest{

    @Test
    fun testCase0(){
        assertEquals(3, bulb(intArrayOf(2,1,3,5,4)))
    }
    @Test
    fun testCase1(){
        assertEquals(2, bulb(intArrayOf(2,3,4,1,5)))
    }

    @Test
    fun testCase2(){
        assertEquals(3, bulb(intArrayOf(1,3,4,2,5)))
    }

}