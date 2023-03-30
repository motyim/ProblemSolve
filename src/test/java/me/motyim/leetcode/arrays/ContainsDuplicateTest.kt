package me.motyim.leetcode.arrays

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class ContainsDuplicateTest{

    private val containsDuplicate = ContainsDuplicate()


    @ParameterizedTest(name = "given {0} array, when validating should return {1}")
    @MethodSource("prepareData")
    fun `given input array, should return true if it has a duplicate`(
        array:IntArray,
        expected: Boolean
    ) {
        assertThat(containsDuplicate.containsDuplicate(array)).isEqualTo(expected)
    }

    private companion object {
        @JvmStatic
        fun prepareData() = listOf(
            arrayOf(intArrayOf(1, 2, 3, 4), false),
            arrayOf(intArrayOf(1, 2, 3, 4, 1), true),
            arrayOf(intArrayOf(1, 1), true),
            arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), false),
            arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1), true)
        )
    }
}