
import java.util.Scanner;

public class function {

    public static void sum() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum();
       
    }
}
