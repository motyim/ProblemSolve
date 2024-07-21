package me.motyim.leetcode.training

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindMiddleIndexTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(testArray: IntArray, expectedIndex: Int) {
        val result = FindMiddleIndex().findMiddleIndex(testArray)
        assertEquals(expectedIndex, result)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(1, 2, 3, 2, 1).toIntArray(), 2),
                Arguments.of(arrayOf(2, 3, -1, 8, 4).toIntArray(), 3),
                Arguments.of(arrayOf(1, -1, 4).toIntArray(), 2),
                Arguments.of(arrayOf(2, 5).toIntArray(), -1),
            )
        }
    }
}