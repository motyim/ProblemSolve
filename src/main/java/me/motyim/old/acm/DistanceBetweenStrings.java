// topcoder 350 div2 (250)
package me.motyim.old.acm;

public class DistanceBetweenStrings {

    public static void main(String[] args) {

    }

    public static int getDistance(String a, String b, String letterSet) {
        int sum = 0;
        a = a.toUpperCase();
        b = b.toUpperCase();
        letterSet = letterSet.toUpperCase();
        for (int i = 0; i < letterSet.length(); i++) {
            int n1 = 0, n2 = 0;
            for (int j = 0; j < a.length(); j++) {
                if (letterSet.charAt(i) == a.charAt(j)) {
                    n1++;
                }
            }
            for (int j = 0; j < b.length(); j++) {
                if (letterSet.charAt(i) == b.charAt(j)) {
                    n2++;
                }
            }
            sum+=(n1-n2)*(n1-n2);
        }

        return sum;
    }

}
