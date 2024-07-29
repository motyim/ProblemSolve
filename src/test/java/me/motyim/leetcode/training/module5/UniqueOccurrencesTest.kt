package me.motyim.leetcode.training.module5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class UniqueOccurrencesTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(arr: IntArray, expected: Boolean) {
        val actual = UniqueOccurrences().uniqueOccurrences(arr)
        assertEquals(expected,actual)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(-3,0,1,-3,1,1,1,-3,10,0),true),
                Arguments.of(intArrayOf(1,2),false),
                Arguments.of(intArrayOf(1,2,2,1,1,3),true),
            )
        }
    }
}
