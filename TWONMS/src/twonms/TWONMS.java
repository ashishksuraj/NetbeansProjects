/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twonms;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class TWONMS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            int c = scan.nextInt();
            for (int i = 0; i < c; i++) {
                if (i % 2 == 0) {
                    a = a * 2;
                } else {
                    b = b * 2;
                }
            }
            if (a > b) {
                System.out.println(a/b);
            } else {
                System.out.println(b/a);
            }
        }
    }

}
