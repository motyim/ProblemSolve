package me.motyim.leetcode.contest101

/**
 * problem : https://leetcode.com/problems/find-the-substring-with-maximum-cost/description/
 * hint : https://www.interviewbit.com/blog/maximum-subarray-sum
 */
class MaximumCostSubstring {
    fun maximumCostSubstring(s: String, chars: String, vals: IntArray): Int {
        val arr = IntArray(s.length)

        for (i in s.indices) {
            arr[i] = if (chars.indexOf(s[i]) != -1) vals[chars.indexOf(s[i])] else s[i] - 'a' + 1
        }

        var max = 0
        var sum = 0
        for (i in arr.indices) {
            sum += arr[i]
            max = max.coerceAtLeast(sum)
            if (sum < 0) sum = 0
        }
        return max
    }
}