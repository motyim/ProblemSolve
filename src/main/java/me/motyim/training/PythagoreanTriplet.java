package me.motyim.training;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
public class PythagoreanTriplet {
    static boolean isTriplet(int arr[], int n){

        int max = Arrays.stream(arr).max().getAsInt();

        int[] hash = new int[max+1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {

            if(hash[i]==0) continue;

            for (int j = 1; j <= max ; j++) {

                if((i==j && hash[i]==1) || hash[j] == 0) continue;

                int c = (int) Math.sqrt(i*i + j*j);

                if(c * c != (i*i + j*j)) continue;

                if(c > max) continue;

                if(hash[c]==1){
                    System.out.println(i+","+j+","+c);
                    System.out.println(Math.pow(i,2)+"+"+Math.pow(j,2)+"="+Math.pow(c,2));
                    return true;
                }


            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = { 3, 2, 4, 6, 5 };
        int n = arr.length;
        if (isTriplet(arr, n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
