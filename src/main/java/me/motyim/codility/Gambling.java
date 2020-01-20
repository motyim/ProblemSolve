package me.motyim.codility;

public class Gambling {

    public int solution(int N, int K) {
        int steps = 0 ;
        while(N != 1 ){
            if(N%2==0 && K > 0){
                N = N/2;
                K--;
            }else {
                N-=1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new Gambling().solution(10,10));
    }
}
