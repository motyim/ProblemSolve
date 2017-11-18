// topcoder 271 div2 (250)
package me.motyim.old.acm;

public class CheckFunction {

    public static void main(String[] args) {
        System.out.println(newFunction("13579"));
    }

    public static int newFunction(String code) {
        char number;
        int dash = 0;
        for (int i = 0; i < code.length(); i++) {
            number = code.charAt(i);
            switch (number) {
                case '0':
                case '6':
                case '9':
                    dash += 6;
                    break;
                case '1':
                    dash += 2;
                    break;
                case '2':
                case '3':
                case '5':
                    dash += 5;
                    break;
                case '4':
                    dash += 4;
                    break;
                case '7':
                    dash += 3;
                    break;
                case '8':
                    dash += 7;
                    break;

            }
        }
        return dash;
    }

}
