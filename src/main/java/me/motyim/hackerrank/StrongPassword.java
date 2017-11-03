package me.motyim.hackerrank;


import java.util.*;
import java.util.regex.*;
/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 03-Nov-17
 */
public class StrongPassword {

    /**
     * Return the minimum number of characters to make the password strong
     * @param n
     * @param password
     * @return
     */
    static int minimumNumber(int n, String password) {

        int remain = 0 ;

        final String numbers = "[0-9]";
        final String lower_case = "[a-z]";
        final String upper_case = "[A-Z]";
        final String special_characters = "[^A-Za-z0-9]";


        //contain number
        remain += findRegex(numbers ,password);

        //contain lowercase
        remain += findRegex(lower_case ,password);

        //contain uppercase
        remain += findRegex(upper_case ,password);

        //contain spical character
        remain += findRegex(special_characters ,password);

        //check length of password
        if(n < 6) return (6 - n > remain)? 6-n : remain;


        return remain ;

    }

    /**
     * check input agians regex
     * @param regex
     * @param input
     * @return 1 if not found 0 if found
     */
    public static int findRegex(String regex , String input){

        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(input);

        return matcher.find() == true ? 0 : 1 ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);

        in.close();
    }
}
