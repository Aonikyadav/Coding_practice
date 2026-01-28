package dsa.recursion;

import java.util.Scanner;

public class Recursion4 {

    static int val(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev = val(n - 1);
        int prevprev = val(n - 2);
        return prev + prevprev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // for (int i = 2; i <= num; i++) {
        //     int val = a + b;
        //     a = b;
        //     b = val;

        for (int i = 0; i <= num; i++) {
            System.out.println(val(i));
        }
    }
}
