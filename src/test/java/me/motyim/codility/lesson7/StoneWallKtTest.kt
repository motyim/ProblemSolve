package me.motyim.codility.lesson7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StoneWallKtTest{

    @Test
    fun `test case 0 ` (){
        assertEquals(7, solution(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)))
    }
}