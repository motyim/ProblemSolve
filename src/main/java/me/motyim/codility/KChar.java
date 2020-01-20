package me.motyim.codility;

import java.util.StringTokenizer;

public class KChar {
    public String solution(String message, int K) {
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(message, " ");
        int currentLength = 0 ;
        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            if(word.length()+builder.length() -1<K ){
                builder.append(word+" ");
            }else break;
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        String s ="The quick brown fox jumps over the lazy dog";
        int k = 39 ;
        System.out.println(new KChar().solution(s,k));
    }
}
