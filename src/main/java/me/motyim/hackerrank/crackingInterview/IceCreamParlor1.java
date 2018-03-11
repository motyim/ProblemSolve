package me.motyim.hackerrank.crackingInterview;

import java.util.*;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 */
public class IceCreamParlor1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a0 = 0; a0 < t; a0++) {
            int money = in.nextInt();
            int n = in.nextInt();

            Map<Integer, Set<Integer>> map = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                int price = in.nextInt();
                if (!map.containsKey(price)) {
                    Set<Integer> set = new HashSet<>();
                    map.put(price, set);
                }
                map.get(price).add(i);
            }
            solve(map, money);
        }
        in.close();
    }

    private static void solve(Map<Integer, Set<Integer>> map, int money) {
        for (Integer price: map.keySet()) {
            int reqirePrice = money - price ;
            if(map.containsKey(reqirePrice)){
                int idx = map.get(price).iterator().next();
                int idxx ;
                Iterator<Integer> iterator = map.get(reqirePrice).iterator();
                do{
                    idxx = iterator.next();
                }while (iterator.hasNext() && idx == idxx);

                System.out.println(++idx +" "+ ++idxx);
                return;
            }
        }
    }
}
