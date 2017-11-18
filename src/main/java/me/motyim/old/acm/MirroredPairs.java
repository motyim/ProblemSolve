package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class MirroredPairs {
    public static void main (String args []){
        char a,b; String s;
        System.out.println("Ready");
        Scanner in=new Scanner (System.in);
        do{
        s=in.nextLine();
        a=s.charAt(0);
        b=s.charAt(1);
        
            switch (a) {
                case 'b':
                    if (b=='d')  {
                        System.out.println("Mirrored pair");
                        break;
                    }
                case 'd':
                    if (b=='b')  {
                        System.out.println("Mirrored pair");
                        break;
                    }
                case 'p':
                    if (b=='q')  {
                        System.out.println("Mirrored pair");
                        break;
                    }
                case 'q':
                    if (b=='p')  {
                        System.out.println("Mirrored pair");
                        break;
                    }
                case ' ': if(b==' ') break;
                default:    System.out.println("Ordinary pair");
            } 
        }while (a!=' '||b!=' ');
        
        //System.out.println(a+" "+b);
        
                
    }
    
}
