// topcoder 557 div2 (250)
package me.motyim.old.acm;

public class GreatFairyWar {



    public static int minHP(int[] dps, int[] hp) {
        int s = 0, sum = 0;
        for (int i : dps) {
            sum += i;
        }
        for (int i = 0; i < hp.length; i++) {
            s += (sum * hp[i]);
            sum -= dps[i];
        }
        return s;
    }

}
