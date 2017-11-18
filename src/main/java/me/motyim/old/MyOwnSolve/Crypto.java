///http://a2oj.com/p.jsp?ID=137
package me.motyim.old.MyOwnSolve;

import java.util.Scanner;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class Crypto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- != 0) {
            in.nextInt();
            int k = in.nextInt();

            in.nextLine();
            String out = "", s = in.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    out += " ";
                } else {
                    char c;
                    if (Character.isUpperCase(s.charAt(i))) {
                        c = (char) ('A' + ((s.charAt(i) - 'A' + k) % 26));
                        c = Character.toLowerCase(c);
                    } else {
                        c = (char) ('a' + ((s.charAt(i) - 'a' + k) % 26));
                        c = Character.toUpperCase(c);
                    }
                    out += c;
                }
            }
            System.out.println(out);
        }
    }
}
