package me.motyim.hackerrank.crackingInterview

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MarkAndToysKtTest{

    @Test
    fun testCase0(){
        assertEquals(4,maximumToys(arrayOf(1 ,12 ,5, 111, 200, 1000, 10),50))
    }
}