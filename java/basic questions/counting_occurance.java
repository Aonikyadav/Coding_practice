import java.util.Scanner;

public class counting_occurance {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target=sc.nextInt();
        int count=0;
        while(num>0) {
            int value=num%10;
            if(value==target) {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
