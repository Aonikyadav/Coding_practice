
import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n1;
        if(n2>=max) {
            max=n2;
        }
        if(n3>=max) {
            max=n3;
        }
        System.out.println(max);
        
        // if(n1>=n2 && n1>=n3) {
        //     System.out.println("N1 is largest: " + n1);
        // }
        // else if (n2>=n1 && n2>=n3) {
        //    System.out.println("N2 is largest: " + n2);
        // }
        // else {
        //     System.out.println("N3 is largest: " + n3);
        // }

        }
}
