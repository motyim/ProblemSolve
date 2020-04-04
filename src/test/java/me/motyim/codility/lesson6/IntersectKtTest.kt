package me.motyim.codility.lesson6

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class IntersectKtTest {

    @Test
    fun testCase1() {
        assertEquals(11, intersect(intArrayOf(1, 5, 2, 1, 4, 0)))
    }
}