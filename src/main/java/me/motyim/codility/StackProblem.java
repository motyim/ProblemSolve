package me.motyim.codility;

import java.util.Stack;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 19-Oct-17
 */
public class StackProblem {


    public int solution(String S){

        // split string with white space
        String[] stringParts=S.split("\\s");

        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<stringParts.length;i++) {
            Integer in;
            switch (stringParts[i])
            {
                case "DUP":
                    if(stack.isEmpty()) return  -1 ;
                    stack.push(stack.peek());
                    break;
                case "POP":
                    if(stack.isEmpty()) return  -1 ;
                    stack.pop();
                    break;
                case "+":
                    if(stack.size() < 1) return -1 ;
                    in= 0;
                    in+=stack.pop();
                    in+=stack.pop();
                    stack.push(in);
                    break;
                case "-":
                    if(stack.size() < 1) return -1 ;
                    in=stack.pop();
                    in-=stack.pop();
                    stack.push(in);
                    break;
                default:
                    stack.push(Integer.parseInt(stringParts[i]));
                    break;
            }
        }

        //last check
        if(stack.size() < 1) return -1 ;
        else return stack.pop();
    }
}
