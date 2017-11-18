// topcoder 443 div2 (250)
package me.motyim.old.acm;

public class SoccerLeagues {

    public static void main(String[] args) {

    }
    public static int[] points(String[] matches){
        int [] x =new int [matches.length];
        for (int i = 0; i < matches.length; i++) {
            for (int j = 0; j < matches.length; j++) {
                switch (matches[i].charAt(j)){
                    case 'W':
                        x[i]+=3;
                        break;
                    case 'D':
                        x[i]+=1;
                        x[j]+=1;
                        break;
                    case 'L':
                        x[j]+=3;
                }
                
            }
            
        }
        return x;
    }
}
