// topcoder 367 div2 (250)


package me.motyim.old.acm;

public class WhiteCells {

    public static void main(String[] args) {
        
    }
    public static int countOccupied(String[] board){
        int occupied=0;
        for (int i = 0; i < board.length; i++) {
            if(i%2==0){
                for (int j = 0; j < board[i].length(); j+=2) {
                    if(board[i].charAt(j)=='F')
                        occupied++; 
                }
            }else{
                for (int j = 1; j < board[i].length(); j+=2) {
                    if(board[i].charAt(j)=='F')
                        occupied++; 
                    
                }
            }
            
        }
        return occupied;
    }
    
}
