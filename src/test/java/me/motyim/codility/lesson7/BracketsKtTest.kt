package me.motyim.codility.lesson7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BracketsKtTest{

    @Test
    fun `test empty string`(){
        assertEquals(1, brackets(""))
    }

    @Test
    fun `test unbalance string`(){
        assertEquals(0, brackets("((())"))
    }

    @Test
    fun `test best case`(){
        assertEquals(1, brackets("{[()()]}"))
    }

    @Test
    fun `test properly nested string`(){
        assertEquals(0, brackets("([)()]"))
    }

    @Test
    fun `invalid structre`(){
        assertEquals(0, brackets(")))((("))
    }

    @Test
    fun `not empty stack`(){
        assertEquals(0, brackets("()()()(("))
    }
}