//http://www.spoj.com/problems/ABCDEF/
package me.motyim.old.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MohamedAhmed
 */
public class ABCDEF {

    public static void main(String[] args)  throws IOException {
        int a, b, c, n1, n2;
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(in.readLine());

        }

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    a = arr[i];
                    b = arr[j];
                    c = arr[k];
                    n1 = (a * b) + c;
                    n2 = a * (b + c);
                    if (map1.containsKey(n1)) {
                        map1.put(n1, map1.get(n1) + 1);
                    } else {
                        map1.put(n1, 1);

                    }

                    if (a != 0) {
                        if (map2.containsKey(n2)) {
                            map2.put(n2, map2.get(n2) + 1);
                        } else {
                            map2.put(n2, 1);
                        }
                    }

                }

            }

        }

        Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet();

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (map2.containsKey(entry.getKey())) {
                sum += entry.getValue() * map2.get(entry.getKey());
            }

        }
        PrintWriter p = new PrintWriter(System.out);
        p.println(sum);
        p.flush();
    }
}
