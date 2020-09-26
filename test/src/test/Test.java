package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int h=0;
        for (int i = n-1; i > 0; i--) {
            if (a[i]==a[i-1]) {
                h++;
            }
            else break;
        }
        System.out.println(h+1);
    }
}
