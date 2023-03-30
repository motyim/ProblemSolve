package me.motyim.leetcode.arrays

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class AnagramTest{

    @ParameterizedTest(name = "check when pass s1={0}, and s2={1}, then should return {2}")
    @MethodSource("testData")
    fun `check if two string are anagram`(
        firstString: String,
        secondString: String,
        expected: Boolean
    ) {
        val actual = Anagram().isAnagram(firstString, secondString)
        assertThat(actual).isEqualTo(expected)
    }

    companion object{
        @JvmStatic
        fun testData()= listOf(
            arrayOf("anagram","nagaram",true),
            arrayOf("rat","car",false)
        )
    }
}