package me.motyim.hackerrank.WeekOfCode35;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 13-Nov-17
 * link : https://www.hackerrank.com/contests/w35/challenges/lucky-purchase
 */
public class LuckyPurchase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //make it sorted on key
        Map<Integer , String> map = new TreeMap <>();

        Pattern pattern = Pattern.compile("[^47]");

        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            int m = in.nextInt();
            String check = ""+m ;

            //must have even length
            if (check.length() % 2 != 0 ) continue;

            //check if contain other numbers
            if(pattern.matcher(check).find()) continue;

            //check equality of 7 & 4 digit
            if(!checkEqulity(check)) continue;

            map.put(m , s);
        }

        if(map.size() == 0 ) System.out.println(-1);
        else{
            int firstKey = map.keySet().iterator().next();
            System.out.println(map.get(firstKey ));
        }

        in.close();


    }

    private static boolean checkEqulity(String check) {
        return check.length() / 2 == check.replaceAll("7", "").length();
    }

}
