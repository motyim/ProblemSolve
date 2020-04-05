package me.motyim.codility.lesson7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FishKtTest{

    @Test
    fun `test case`(){
        assertEquals(2, fish(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)))
    }

    @Test
    fun `test case extended`(){
        assertEquals(3, fish(intArrayOf(4, 3, 2, 1, 5, 8), intArrayOf(0, 1, 0, 0, 0,1)))
    }

    @Test
    fun `test case extended new`(){
        assertEquals(1, fish(intArrayOf(4, 6, 2, 1, 5, 8), intArrayOf(1, 1, 0, 0, 1,0)))
    }

    @Test
    fun `empty arrays`(){
        assertEquals(0, fish(intArrayOf(), intArrayOf()))
    }

    @Test
    fun `one direction arrays`(){
        assertEquals(3, fish(intArrayOf(4,8,2), intArrayOf(0,0,0)))
    }

    @Test
    fun `one direction arrays2`(){
        assertEquals(3, fish(intArrayOf(4,8,2), intArrayOf(1,1,1)))
    }


    @Test
    fun `test stay one`(){
        assertEquals(1, fish(intArrayOf(10,1,1,1), intArrayOf(1,0,0,0,0)))
    }

    @Test
    fun `test stay all`(){
        assertEquals(4, fish(intArrayOf(10,1,1,1), intArrayOf(0,0,0,0,1)))
    }

    @Test
    fun test(){
        assertEquals(2, fish(intArrayOf( 4, 3, 2, 1, 5  ),intArrayOf( 0, 1, 1, 0, 0 )))
    }
    
    @Test
    fun `out test`(){
        assertEquals(3, fish(intArrayOf( 4, 3, 2, 1, 5 ),intArrayOf( 1, 0, 1, 0, 1 )))
        assertEquals(2, fish(intArrayOf( 4, 3, 2, 0, 5  ),intArrayOf( 0, 1, 0, 0, 0 )))
        assertEquals(2, fish(intArrayOf( 4, 3, 2, 1, 5  ),intArrayOf( 0, 1, 0, 0, 0 ) ))

        assertEquals(2, fish(intArrayOf( 4, 3, 2, 5, 6  ),intArrayOf( 1, 0, 1, 0, 1 ) ))
        assertEquals(3, fish(intArrayOf( 7, 4, 3, 2, 5, 6  ),intArrayOf( 0, 1, 1, 1, 0, 1 ) ))
        assertEquals(4, fish(intArrayOf( 3, 4, 2, 1, 5  ),intArrayOf( 1, 0, 0, 0, 0 ) ))
        assertEquals(1, fish(intArrayOf( 3  ),intArrayOf( 1 ) ))
        assertEquals(1, fish(intArrayOf( 3  ),intArrayOf( 0 )))
    }
}