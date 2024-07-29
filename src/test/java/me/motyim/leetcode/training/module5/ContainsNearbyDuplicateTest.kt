package me.motyim.leetcode.training.module5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ContainsNearbyDuplicateTest{

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(nums: IntArray, k: Int, expected: Boolean){
        val actual = ContainsNearbyDuplicate().containsNearbyDuplicate(nums, k)
        assertEquals(expected,actual)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1,2,3,1), 3,true),
                Arguments.of(intArrayOf(1,0,1,1), 1,true),
                Arguments.of(intArrayOf(1,2,3,1,2,3), 2,false),
            )
        }
    }
}