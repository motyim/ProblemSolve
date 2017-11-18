/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyOwnSolve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class test2 {
    public static void main(String[] args) {
        try {
            TwoThreeTree<Integer> b=new TwoThreeTree<Integer>();
            //change it
            Scanner in =new Scanner(new File("C:\\Users\\MohamedAhmed\\Desktop\\input.txt"));
            StringTokenizer st=new StringTokenizer(in.nextLine(), ",");
            
            while(st.hasMoreTokens())
                b.add(Integer.parseInt(st.nextToken()));
            
            while(in.hasNext()){
                String oper =in.next();
                int key =in.nextInt();
                switch(oper){
                    case "Find":
                        System.out.print("Find"+key+": ");
                        System.out.println(b.contains(key)?
                                "found; "+key+" is the "+b.indexOf(key)+"th element of the list"
                                : "not Found");
                        break;
                        
                    case "Insert":
                        b.add(key);
                        System.out.println("Insert "+key+" :After the insertion,"
                                +key+" is the "+b.indexOf(key)+"th element of the list");
                        break;
                        
                    case "Delete":
                        
                        System.out.println("Delete"+key+" :"+key+"is the "
                                +b.indexOf(key)+"th element of thr list, deleted");
                        b.remove(key);
                        break;
                        
                }
            }
            
            
            System.out.println(b.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(test2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
