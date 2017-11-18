//http://codeforces.com/contest/519/problem/A
package me.motyim.old.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AandBandChess {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s;
        int white = 0, blak = 0;
        while ((s = in.readLine()) != null && !s.trim().equals("")) {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '.':
                        break;
                    case 'Q':
                        white += 9;
                        break;
                    case 'R':
                        white += 5;
                        break;
                    case 'B':
                    case 'N':
                        white += 3;
                        break;
                    case 'P':
                        white += 1;
                        break;
                    case 'q':
                        blak += 9;
                        break;
                    case 'r':
                        blak += 5;
                        break;
                    case 'b':
                    case 'n':
                        blak += 3;
                        break;
                    case 'p':
                        blak += 1;
                        break;

                }
            }

        }
        if(blak>white)
            out.println("Black");
        else if(white>blak)
            out.println("White");
        else 
            out.println("Draw");
        out.flush();
    }
}
