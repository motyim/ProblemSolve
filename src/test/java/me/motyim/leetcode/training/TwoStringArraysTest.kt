package me.motyim.leetcode.training

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TwoStringArraysTest{

    @ParameterizedTest
    @MethodSource("useCases")
    fun `test Cases`(){
        val result = TwoStringArrays().arrayStringsAreEqual(arrayOf("a", "bc"), arrayOf("ab", "c"))
        assertThat(result).isEqualTo(true)
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf("a", "bc"), arrayOf("ab", "c"), true),
                Arguments.of(arrayOf("ab", "bc"), arrayOf("ab", "bc"), true),
                Arguments.of(arrayOf("ab", "bcc"), arrayOf("ab", "bc"), false),
            )
        }
    }

}