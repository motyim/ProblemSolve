package me.motyim.hackerrank.testExam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 12-Mar-18
 */
public class Kdiff {


    static int kDifference(int[] a, int k) {
        Set<Integer> set = new TreeSet<>();

        int count = 0 ;
        //add to set
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i]-k)) count++;

        }

        return count ;
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = kDifference(a, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
