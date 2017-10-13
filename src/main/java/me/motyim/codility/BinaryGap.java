package me.motyim.codility;

/**
 * https://codility.com/programmers/lessons/1-iterations/binary_gap/
 * Created by MY-PC on 13-Oct-17.
 */
public class BinaryGap {

    public int solution(int N) {
        String b = Integer.toBinaryString(N);
        int max = 0;
        int current = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '0') current++;
            else {
                if (current > max)
                    max = current;
                current = 0;
            }
        }
        return max;
    }
}
