//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2324
package me.motyim.old.MyOwnSolve;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class SymmetricMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 1;
        while (t-- != 0) {

            boolean sy = true;
            in.next();
            in.next();
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        in.nextInt();
                    } else if (i < j) {
                        a.add(in.nextInt());
                    } else {
                        b.add(in.nextInt());
                    }
                }
            }

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(b.size() - 1 - i)) {
                    System.out.println("Test #" + k++ + ": Non-symmetric.");
                    sy = false;
                    break;
                }

            }
            if (sy) {
                System.out.println("Test #" + k++ + ": Symmetric.");
            }

        }
     //   System.exit(0);
    }
}
