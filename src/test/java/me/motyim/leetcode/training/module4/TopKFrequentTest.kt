package me.motyim.leetcode.training.module4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TopKFrequentTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(nums: IntArray, k: Int, expected: IntArray) {
        val actual = TopKFrequent().topKFrequent(nums, k)
        assertArrayEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 2, intArrayOf(1, 2)),
                Arguments.of(intArrayOf(1), 1, intArrayOf(1)),
            )
        }
    }
}