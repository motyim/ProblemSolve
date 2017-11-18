//https://icpcarchive.ecs.baylor.edu/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2874
package me.motyim.old.acm;

import java.util.Scanner;

public class PenneyGame {

    public static void main(String[] args) {
        int[] x = new int[8];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        String [] r= new String[n];
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            s[m - 1] = in.next();
        }

        String c;

        for (int j = 0; j < s.length; j++) {
            for (int i = 0; i < s[j].length()-2; i++) {
                c = s[j].substring(i, i + 3);
                switch (c) {
                    case "TTT":
                        x[0]++;
                        break;
                    case "TTH":
                        x[1]++;
                        break;
                    case "THT":
                        x[2]++;
                        break;
                    case "THH":
                        x[3]++;
                        break;
                    case "HTT":
                        x[4]++;
                        break;
                    case "HTH":
                        x[5]++;
                        break;
                    case "HHT":
                        x[6]++;
                        break;
                    case "HHH":
                        x[7]++;
                        break;
                }

            }
            r[j]=(j+1)+XtoSting(x);
            x=new int [8];
        }

        for (String i : r) {
            System.out.println(i);
        }
    }
    public static String XtoSting(int [] x){
        StringBuffer s =new StringBuffer();
        for (int i = 0; i <x.length; i++) {
            s.append(" "+x[i]);
        }
        return new String(s);
    }

}
