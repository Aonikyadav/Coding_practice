
import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0 , b=1;
        int num = sc.nextInt();
        if(num<=0) {
            System.out.println("Enter the positive number or More than 0 ");
        }
        else if (num==1) {
            System.out.println(num);
        }
        else {
             System.out.print(a +" " + b + " ");
        for (int i = 2; i <= num; i++) {
        int sum = a+b;
        a=b;
        b=sum;
       System.out.print(sum + " ");
       
        }
      }
    }
}
