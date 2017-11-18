//http://a2oj.com/p.jsp?ID=139
package me.motyim.old.MyOwnSolve;

import java.util.Scanner;

public class RLESecret {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- != 0) {
            String out = "", s = in.next();
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - 1) {
                    out += s.charAt(i) + "" + count;

                } else if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;

                } else {
                    out += s.charAt(i) + "" + count;
                    count = 1;
                }
                
            }
            System.out.println(out);
        }
    }
}
