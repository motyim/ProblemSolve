package me.motyim.hackerrank.crackingInterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 * link https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 */
public class BalancedBrackets {


    public static boolean isBalanced(String expression) {

        if (expression.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        boolean equal = true;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    equal = checkEqual('(',stack);
                    break;
                case '}':
                    equal = checkEqual('{',stack);
                    break;
                case ']':
                    equal = checkEqual('[',stack);
                    break;

            }
            if(!equal) break;
        }

        if(!stack.empty()) return false ;

        return equal;
    }

    private static boolean checkEqual(char c, Stack<Character> stack) {
        if(stack.empty()) return false;

        return c == stack.pop();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
