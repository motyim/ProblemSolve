package me.motyim.old.acm;

public class Sortness {

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 6, 7, 5, 8};
        System.out.println(getSortness(a));
    }

    public static double getSortness(int[] a) {
        int[] b = new int[a.length];
        int st, sum = 0;
        for (int i = 0; i < a.length; i++) {
            st = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    st++;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] < a[j]) {
                    st++;
                }
            }
            sum += st;
        }
        return (double) sum / a.length;
    }

}
