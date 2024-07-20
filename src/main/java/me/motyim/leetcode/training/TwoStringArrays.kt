package me.motyim.leetcode.training

class TwoStringArrays {

    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }

}