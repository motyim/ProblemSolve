package me.motyim.leetcode.training.module4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindKthLargestTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(nums: IntArray, k: Int, answer: Int) {
        val findKthLargest = FindKthLargest().findKthLargest(nums, k)
        assertEquals(answer, findKthLargest)
    }

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCasesEnhance(nums: IntArray, k: Int, answer: Int) {
        val findKthLargest = FindKthLargest().findKthLargestEnhanced(nums, k)
        assertEquals(answer, findKthLargest)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(3, 2, 1, 5, 6, 4), 2, 5),
                Arguments.of(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4, 4),
            )
        }
    }
}