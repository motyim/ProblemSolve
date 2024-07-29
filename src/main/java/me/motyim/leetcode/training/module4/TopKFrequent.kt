package me.motyim.leetcode.training.module4

class TopKFrequent {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val freq = Array(nums.size + 1) {
            mutableListOf<Int>()
        }

        nums.forEach { map[it] = 1 + (map[it] ?: 0) }
        map.forEach { (key, value) -> freq[value].add(key) }

        val answer = mutableListOf<Int>()
        for (i in freq.size - 1 downTo 0) {
            for(n in freq[i]){
                answer.add(n)
                if (answer.size == k)  return answer.toIntArray()
            }
        }
        return answer.take(k).toIntArray()

    }
}