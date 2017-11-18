

package me.motyim.old.acm;


public class text2 {

    public static void main(String[] args) {
        System.out.println(averageLength("        ,         "));
        
        
    }
    public static double averageLength(String text) {
        
        int sum=0;
        int world=0;
        char c;
        for (int i = 0; i < text.length(); i++) {
            c=text.charAt(i);
            if(c!=' '&&!Character.isLetter(c)){
                text=text.replace(c,' ');
            }
        }
        text=text.trim();
        if(text.equals(""))
            return 0;
        String [] s =text.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i]=s[i].trim();
            if(!s[i].equals("")){
                sum+=s[i].length();
                world++;
            }
        }
        System.out.println(" w :"+world+" sum :"+sum);

    
        return (double)sum/world;
    }
    
}
