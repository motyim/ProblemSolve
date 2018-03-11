package me.motyim.hackerrank.crackingInterview;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 * link https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem
 * result TimeOut
 */
public class IceCreamParlor {
    static void solve(int[] arr, int money) {

        for (int i = 0; i < arr.length; i++) {
            int x = money - arr[i];
            boolean found = false;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j] == x){
                    x = j ;
                    found =true;
                    break ;
                }
            }

            if (found){
                System.out.println((i+1)+" "+(x+1));
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }

}
