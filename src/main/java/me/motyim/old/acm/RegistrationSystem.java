//http://codeforces.com/problemset/problem/4/C
package me.motyim.old.acm;

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        HashMap m =new HashMap();
        Scanner in=new Scanner(System.in);
        StringBuffer s=new StringBuffer();
        int n=in.nextInt();
        String name;
        for (int i = 0; i <n; i++) {
            name=in.next();
            if(m.containsKey(name)){
                int j=(int)m.get(name)+1;
                m.put(name, j);
                s.append(name+j+"\n");
            }else{
                m.put(name, 0);
                s.append("OK\n");
            }
        }
        System.out.print(s);
        
    }
    
}