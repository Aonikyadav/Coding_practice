
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int val = sc.nextInt();
        int n=1;
        // while(n<=val) {
        //     System.out.print(" " + n);        WHILE LOOP
        //     n++;
        // }

        do { 
            System.out.print(" " + n);
            n++;
        } while (n<=val);
    }
}
