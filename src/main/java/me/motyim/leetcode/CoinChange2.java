package me.motyim.leetcode;

/**
 * <a href="https://leetcode.com/problems/coin-change-ii/">problem</a>
 */
public class CoinChange2 {
    public int coinChange(int[] coins, int amount) {
        int [][] ways = new int [coins.length+1][amount+1];

        //int first col
        for(int row=0 ;row<ways.length;row++){
            ways[row][0] =1;
        }

        for(int col = 1 ; col< ways[0].length;col++ ){
            ways[0][col] = 0;
        }

        for(int row = 1 ;row< ways.length;row++){
            for(int col = 1; col < ways[row].length;col++){
                int remining = (col - coins[row-1])>= 0 ? ways[row][col - coins[row-1]]: 0;
                ways[row][col] = ways[row-1][col] +remining;
            }
        }

        return ways[coins.length][amount];
    }

    public static void main(String[] args) {
        int coinChange = new CoinChange2().coinChange(new int[]{1,2,5}, 5);
        System.out.println(coinChange);
    }
}
