package me.motyim.codility;

import java.util.HashMap;
import java.util.Map;

public class LovlyNumber {

    public int solution(int A, int B) {
        int number = 0 ;

        for (int i = A; i <= B; i++) {
            if(isLovely(i)){
                number++;
            }
        }
        return number;
    }

    private boolean isLovely(int A) {
        String s = A +"";
       if(s.length() < 3) return true;

       Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int occuer = 0 ;
            if(map.containsKey(c)){
                occuer = map.get(c);
                if(occuer+1 > 2 ) return false;
            }
            map.put(c,occuer+1);
        }
       return true;
    }

}
