package me.motyim.leetcode.contest101


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class SmallestNumberTwoArraysTest{
    @ParameterizedTest
    @MethodSource("testData")
    fun `test cases`(
        num1: IntArray,
        num2: IntArray,
        expected: Int
    ) {
        val actual = SmallestNumberTwoArrays().minNumber(num1,num2)
        assertThat(actual).isEqualTo(expected)
    }

    companion object{
        @JvmStatic
        fun testData()= listOf(
            arrayOf(intArrayOf(4,1,3), intArrayOf(5,7),15),
            arrayOf(intArrayOf(3,5,2,6), intArrayOf(3,1,7),3)
        )
    }
}