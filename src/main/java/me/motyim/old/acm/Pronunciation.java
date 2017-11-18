//top coder
package me.motyim.old.acm;

public class Pronunciation {

    public static void main(String[] args) {
        String[] s = {"Yumm", "yoop", "buy", "SAY", "yy", "TY", "YAYO", "alsoimpossibletopronounce", "reallydifficult"};
        System.out.println(canPronounce(s));
    }

    public static String canPronounce(String[] words) {
        int c, v;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            c = v = 0;
            for (int j = 0; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U': {
                        c = 0;
                        v++;
                        //System.out.println(s.charAt(j) + " " + c + " " + v);

                        if (v == 2) {
                            char c1 = Character.toUpperCase(s.charAt(j));
                            char c2 = Character.toUpperCase(s.charAt(j - 1));
                            if (c1 == c2) {
                                v = 1;
                            }
                        }
                        break;
                    }
                    default: {
                        //  System.out.println(s.charAt(j));
                        c++;
                        v = 0;

                    }

                }
                if (c == 3 || v == 2) {
                    // System.out.println("--" + s.charAt(j) + " " + c + " " + v);
                    return s;
                }

            }

        }
        return "";
    }

}
