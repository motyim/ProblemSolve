package me.motyim.leetcode.arrays

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TwoSumTest{

    @ParameterizedTest(name = "check when pass {0} has two element {2} which there sum is {1}")
    @MethodSource("testData")
    fun `check if array has two element which there sum equal to target`(
        array: IntArray,
        target: Int,
        expected: IntArray
    ){
        val actual = TwoSum().twoSum(array, target)
        assertThat(actual).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2,7,11,15),9, intArrayOf(0,1)),
                Arguments.of(intArrayOf(3,2,4),6, intArrayOf(1,2)),
                Arguments.of(intArrayOf(3,3),6, intArrayOf(0,1))
            )
        }
    }
}