package me.motyim.training.stringsearch;

/**
 * links
 * https://www.youtube.com/watch?v=BXCEFAzhxGY
 * https://www.youtube.com/watch?v=V5-7GzOfADQ
 * https://www.interviewbit.com/blog/kmp-algorithm-pattern-search/
 * https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
 */
public class KMP {

    public void stringSearch(String str, String pattern) {
        int stringLength = str.length();
        int length = pattern.length();

        int lps[] = computeLPSArray(pattern);
        int j = 0; //index for pattern
        int i = 0;

        while (i < stringLength) {
            if (pattern.charAt(j) == str.charAt(i)) {
                i++;
                j++;
            }
            // found it
            if (j == length) {
                System.out.println("found pattern @ " + (i - j));
                // reset search again
                j = lps[j - 1];
            } else if (i < stringLength && pattern.charAt(j) != str.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }


        }


    }

    private int[] computeLPSArray(String pattern) {
        int lps[] = new int[pattern.length()];
        lps[0] = 0; //is always 0
        int len = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len == 0) {
                    lps[i++] = 0;
                } else {
                    len = lps[len - 1];
                }
            }
        }
        return lps;
    }


    public static void main(String[] args) {
        new KMP().stringSearch("aaaab", "ab");
    }
}
