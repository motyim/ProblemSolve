//http://codeforces.com/problemset/problem/63/A
package me.motyim.old.acm;

import java.util.ArrayList;
import java.util.Scanner;

public class SinkingShip {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s, type, captian = "";
        ArrayList<String> man = new ArrayList<String>();
        ArrayList<String> rat = new ArrayList<String>();
        ArrayList<String> w_c = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            s = in.next();
            type =in.next();
            switch (type) {
                case "captain":
                    captian = s;
                    break;
                case "man":
                    man.add(s);
                    break;
                case "rat":
                    rat.add(s);
                    break;
                case "woman":
                case "child":
                    w_c.add(s);
                    break;
            }

        }
        print(rat);
        print(w_c);
        print(man);
        System.out.println(captian);
    }

    public static void print(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }

}
