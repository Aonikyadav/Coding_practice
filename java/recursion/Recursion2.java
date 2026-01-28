package dsa.recursion;

import java.util.*;

public class Recursion2 {

    static void printReverseR(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printReverseR(n - 1);
    }
    //     if (n == 5) {
    //         System.out.println(n);
    //         printReverseR(n - 1);
    //     } else if (n != 1) {
    //         System.out.println(n);
    //         printReverseR(n - 1);
    //     } else {
    //         System.out.println(1);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // printReverseN(num);
        printReverseR(num);
    }
}
