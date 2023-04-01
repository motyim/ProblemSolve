package me.motyim.leetcode.contest101

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class MaximumCostSubstringTest{
    @ParameterizedTest
    @MethodSource("testData")
    fun `test case`(
        s: String,
        chars: String,
        vals: IntArray,
        expected: Int
    ) {
        val actual = MaximumCostSubstring().maximumCostSubstring(s,chars,vals)
        Assertions.assertThat(actual).isEqualTo(expected)
    }

    companion object{
        @JvmStatic
        fun testData()= listOf(
            arrayOf("adaa","d", intArrayOf(-1000),2),
            arrayOf("a","", intArrayOf(0),1),
            arrayOf("abc","abc", intArrayOf(-1,-1,-1),0),
            arrayOf("kqqqqqkkkq","kq", intArrayOf(-6,6),30),
            arrayOf(
                "okyytyj",
                "uafndmokwztrjphgle",
                intArrayOf(189,-229,860,782,-194,-582,-743,966,777,90,526,-806,-992,845,-997,340,80,705),
                1567)
        )
    }
}