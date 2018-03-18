package me.motyim.hackerrank.testExam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 */
public class FindTheNumber {

    static int[] counts(int[] nums, int[] maxes) {

        int [] res = new int [maxes.length];

        Map<Integer , Integer> map = new LinkedHashMap<>();
        Map<Integer , Integer> idx = new TreeMap<>();
        //map maxes to index
        for (int i = 0; i < maxes.length; i++) {
            idx.put(i,maxes[i]);
        }
        for(int i =0 ; i < maxes.length ; i++){
            map.put(maxes[i],i);
        }
        int lastIdx = 0 ;

        Arrays.sort(nums);
        Arrays.sort(maxes);

        for(int i = 0 ; i <maxes.length ; i++){
            res[i]= (i>0)? res[i-1]:0;
            for(int j = lastIdx ; j < nums.length ; j++){
                if(nums[j] <= maxes[i]) res[i]++;
                else {
                    lastIdx = j ;
                    break;
                }
            }

            map.put(maxes[i],res[i]);
            if(i!= 0 && lastIdx == 0 ) break;
        }
        int z = 0 ;
        for(Integer a : idx.keySet()){
            int value = idx.get(a);
            res[z]=map.get(value);
            z++;
        }

        return res ;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        int nums_size = 0;
        nums_size = Integer.parseInt(in.nextLine().trim());

        int[] nums = new int[nums_size];
        for(int i = 0; i < nums_size; i++) {
            int nums_item;
            nums_item = Integer.parseInt(in.nextLine().trim());
            nums[i] = nums_item;
        }

        int maxes_size = 0;
        maxes_size = Integer.parseInt(in.nextLine().trim());

        int[] maxes = new int[maxes_size];
        for(int i = 0; i < maxes_size; i++) {
            int maxes_item;
            maxes_item = Integer.parseInt(in.nextLine().trim());
            maxes[i] = maxes_item;
        }

        res = counts(nums, maxes);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}