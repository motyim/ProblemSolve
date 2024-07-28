package me.motyim.leetcode.training.module4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class kClosestTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(points: Array<IntArray>, k: Int, expected: Array<IntArray>) {
        val actual = kClosest().kClosest(points, k)
        assertArrayEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1, arrayOf(intArrayOf(-2, 2))),
                Arguments.of(
                    arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)),
                    2,
                    arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4)),
                ),
            )
        }
    }
}