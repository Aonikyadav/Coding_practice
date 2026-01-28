package dsa.recursion;

import java.util.*;

public class Recursion3 {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int smallval = factorial(n - 1);

        int ans = n * smallval;

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int fact = 1;
        // for (int i = 2; i <= num; i++) {
        //     fact = fact * i;
        //     System.out.println(fact);

        System.out.println(factorial(num));
    }

}
