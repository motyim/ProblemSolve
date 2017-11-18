// topcoder 332 div2 (250)
package me.motyim.old.acm;

public class TextStatistics {

    public static void main(String[] args) {
        averageLength("WsLeMVw51");
    }

    public static double averageLength(String text) {
        double ave = 0;
        int space = 0;
        char c;
        int num=0;
        StringBuilder s = new StringBuilder(".");
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (Character.isLetter(c)) {
                s.append(c);
                j++;
                num++;
            }
            if (!Character.isLetter(c) && s.charAt(j) != '.') {

                s.append(".");
                j++;
                if(i!=text.length()-1)
                space++;
            }

        }
        System.out.println(s);
        System.out.println("space : " + space + " lenght :" +num);

        ave = (double) num / (space +1);
        System.out.println(ave);
        return ave;
    }

}
