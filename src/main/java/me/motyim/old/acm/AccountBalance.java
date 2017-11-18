// topcoder 288 div2 (250)
package me.motyim.old.acm;

public class AccountBalance {

    public static void main(String[] args) {
        String[] s = {"C 1000", "D 500", "D 350"};
        processTransactions(100, s);
    }

    public static int processTransactions(int startingBalance, String[] transactions) {
        char type;
        for (int i = 0; i < transactions.length; i++) {
            type = transactions[i].charAt(0);
            if (type == 'C') {

                startingBalance += Integer.parseInt(transactions[i].substring(2, transactions[i].length()));

            } else {

                startingBalance -= Integer.parseInt(transactions[i].substring(2, transactions[i].length()));

            }

        }
        return startingBalance;
    }

}
