package me.motyim.leetcode.training

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ReverseLinkedListTest {

    @ParameterizedTest
    @MethodSource("useCases")
    fun testCases(headNode: ListNode, expected: ListNode) {
        val result = ReverseLinkedList().reverseList(headNode)
        val shouldEqual = shouldEqual(expected, result)
        assertTrue(shouldEqual)
    }


    private fun shouldEqual(expected: ListNode?, actual: ListNode?): Boolean {
        var expectedHead = expected
        var actualHead = actual
        while (expectedHead != null && actualHead != null) {
            if (expectedHead.`val` != actualHead.`val`) return false
            expectedHead = expectedHead.next
            actualHead = actualHead.next
        }
        return expectedHead == null && actualHead == null
    }

    companion object {
        @JvmStatic
        fun useCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    convertArrayToNodes(arrayOf(1, 2, 3).toIntArray()),
                    convertArrayToNodes(arrayOf(3, 2, 1).toIntArray())
                ),
                Arguments.of(
                    convertArrayToNodes(arrayOf(1,2,3,4,5).toIntArray()),
                    convertArrayToNodes(arrayOf(5,4,3,2,1).toIntArray())
                ),
            )
        }

        private fun convertArrayToNodes(array: IntArray): ListNode? {
            if (array.isEmpty()) return null
            val head = ListNode(-1)
            var current = head
            for (i in array) {
                current.next = ListNode(i)
                current = current.next!!
            }
            return head.next
        }
    }
}