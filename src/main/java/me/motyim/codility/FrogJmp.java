package me.motyim.codility;

/**
 * https://codility.com/demo/results/trainingJDG9FF-3MD/
 * https://codility.com/demo/results/trainingMFA72Q-AW7/
 * Created by MY-PC on 13-Oct-17.
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int jumbs = 0 ;

        while(X < Y){
            X+=D;
            jumbs++;
        }

        return jumbs ;
    }

    public int solution2(int X, int Y, int D) {
        return (int)Math.ceil(((double)(Y - X)) / D);
    }
}
