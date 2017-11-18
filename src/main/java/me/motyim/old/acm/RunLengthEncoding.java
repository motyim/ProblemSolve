package me.motyim.old.acm;

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(decode("4A3BC2DE"));
    }

    public static String decode(String text) {
        StringBuffer s = new StringBuffer();
        String m = "";
        int repeat=1;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                m += text.charAt(i);
                repeat=Integer.parseInt(m);
                if(repeat>50)
                    return "TOO LONG";
                continue;
            }
            if(Character.isAlphabetic(text.charAt(i))){
             //   System.out.println(repeat+"  "+text.charAt(i));
                for (int j = 0; j <repeat; j++) {
                    s.append(text.charAt(i));
                }
            }
            repeat=1;
            m="";
            if(s.length()>50)
                return "TOO LONG";

        }
        return new String(s);
    }

}
