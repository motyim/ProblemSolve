package me.motyim.codility

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class DisjointPointssKtTest{

    @Test
    fun test(){
        assertEquals(5, solution(intArrayOf(1,12,42,70,36,-4,43,15),
                intArrayOf(5,15,44,72,36,2,69,24)))
    }
}