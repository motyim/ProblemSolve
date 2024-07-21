package me.motyim.leetcode.training

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MaxProfitTest {

    @ParameterizedTest
    @MethodSource("useCase")
    fun `test Cases`(testArray: IntArray, expectedProfit: Int) {
        val maxProfit = MaxProfit().maxProfit(testArray)
        assertEquals(expectedProfit, maxProfit)
    }

    companion object {

        @JvmStatic
        fun useCase(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(7, 1, 5, 3, 6, 4).toIntArray(), 5),
                Arguments.of(arrayOf(7, 6, 4, 3, 1).toIntArray(), 0)
            )
        }
    }

}