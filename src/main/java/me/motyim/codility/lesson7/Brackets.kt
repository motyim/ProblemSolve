package me.motyim.codility.lesson7

import java.util.*


fun brackets(S: String): Int {

    if(S.isEmpty()) return 1

    if(S.length%2 != 0 ) return 0

    val stack = Stack<Char>()

    for (i in S){
        when(i){
            '{','(','['-> stack.push(i)
            '}' -> if (stack.empty() || stack.pop() != '{') return 0
            ')' -> if (stack.empty() || stack.pop() != '(') return 0
            ']' -> if (stack.empty() || stack.pop() != '[') return 0
        }
    }
    return if (stack.empty()) 1 else 0
}
