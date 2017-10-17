package me.motyim.codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by MotYim on 17-Oct-17.
 */
public class GenomicRangeQuery {

    //---------------------------------------------------
    // Solution number one
    // correctness : 100% / performance : 0%
    // link : https://codility.com/demo/results/training328EGA-WZ6/
    //---------------------------------------------------
    public int[] solution(String S, int[] P, int[] Q) {
        int [] result = new int [P.length];
        
        // int represnation for S
        int [] DNA = new int [S.length()];
        
        //convert S to int
        // O(n)
        for (int i = 0; i < S.length() ; i++) {
            
            switch (S.charAt(i)){
                case 'A':
                    DNA[i] = 1 ;
                    break;
                case 'C':
                    DNA[i] = 2 ;
                    break;
                case 'G':
                    DNA[i] = 3 ;
                    break;
                case 'T':
                    DNA[i] = 4 ;
                    break;
            }
            
        }

        //O(N^2)
        for (int i = 0; i < P.length; i++) {
            result[i] = findMin(DNA , P[i] , Q[i]);
        }
        
        return result;
    }

    private int findMin(int[] dna, int i, int i1) {
        int min = dna[i];
        for (int j = i+1; j <= i1; j++)
        {
            min = Math.min(min , dna[j]);
        }
        return min ;
    }

    //---------------------------------------------------
    // Solution number Two
    // correctness : 100% / performance : 33%
    // link : https://codility.com/demo/results/trainingN6SV4H-PC3/
    //---------------------------------------------------

    public int[] solution2(String S, int[] P, int[] Q){
        int [] res = new int [P.length];
        //to store <factor , {idx which has occur in } >
        Map<Integer , Set> map = new HashMap<Integer, Set>();

        // convert letters to factors and add it to map
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)){
                case 'A':
                    add(map,1,i);
                    break;
                case 'C':
                    add(map,2,i);
                    break;
                case 'G':
                    add(map,3,i);
                    break;
                case 'T':
                    add(map,4,i);
                    break;
            }
        }

        for (int i = 0; i < Q.length; i++) {
            res[i] = find(map , P[i] ,Q[i]);
        }
        return res ;
    }

    /**
     * find the minmial factor with in range
     * @param map
     * @param p
     * @param q
     * @return
     */
    private int find(Map<Integer, Set> map, int p, int q) {

        for (Map.Entry<Integer, Set> entrie : map.entrySet() ) {
            //convert set to array of integers
            Integer [] arr = (Integer [])entrie.getValue().toArray(new Integer[entrie.getValue().size()]);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= p && arr[i] <= q) return entrie.getKey();
            }

        }
        return -1 ;
    }

    /**
     * add key and idx which has occur in
     * @param map
     * @param key
     * @param index
     */
    private void add(Map<Integer, Set> map, int key, int index) {
        Set <Integer> s;
        if(map.get(key) == null ){
            s=new HashSet<Integer>();
        }else{
            s =map.get(key);
        }
        s.add(index);
        map.put(key,s);
    }
}
