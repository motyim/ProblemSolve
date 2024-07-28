package me.motyim.leetcode.training.stack

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class NextGreaterElementTest{

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(num1:IntArray,num2: IntArray,expected:IntArray){
        val solution = NextGreaterElement().nextGreaterElement(num1, num2)
        assertArrayEquals(expected,solution)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(4,1,2), intArrayOf(1,2,3,4), intArrayOf(-1,2,3)),
                Arguments.of(intArrayOf(4,1,2), intArrayOf(2,1,3,4), intArrayOf(-1,3,3)),
                Arguments.of(intArrayOf(4,1,2), intArrayOf(1,3,4,2), intArrayOf(-1,3,-1)),
                Arguments.of(intArrayOf(2,4), intArrayOf(1,2,3,4), intArrayOf(3,-1)),
            )
        }
    }

}