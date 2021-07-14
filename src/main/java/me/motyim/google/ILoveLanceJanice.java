package me.motyim.google;

public class ILoveLanceJanice {
    public static String solution(String x){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
         if(x.charAt(i) >= 97 && x.charAt(i) <=122){
                sb.append((char)(110+(109-x.charAt(i))));
         }else sb.append(x.charAt(i));
        }
        return sb.toString();
    }
}
