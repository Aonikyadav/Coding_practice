
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        while (true) { 
            char op= sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

// if(op=='+' || op=='-' || op=='/' || op=='*' ||op=='%') {
//                 int num1= sc.nextInt();
//                 int num2 = sc.nextInt();
//                 if(op =='+') {
//                     ans=num1+num2;
//                 }
//                 else if(op =='-') {
//                     ans=num1-num2;
//                 }
//                else if(op =='*') {
//                     ans=num1*num2;
//                 }
//                 else if(op =='/') {
//                     if (num2 == 0) {
//                         System.out.println("Error: Division by zero!");
//                         continue;
//                     }
//                     ans=num1/num2;
//                 }
//                else {
//                 if (num2 == 0) {
//                         System.out.println("Error: Division by zero!");
//                         continue;
//                     }
//                     ans=num1%num2;
//                 }
//                 System.out.println("Your Answer is :" + ans);
//             }


             if(op=='+' || op=='-' || op=='/' || op=='*' ||op=='%') {
                int num1= sc.nextInt();
                int num2 = sc.nextInt();
                switch (op) {
                    case '+' -> ans=num1+num2;
                    case '-' -> ans=num1-num2;
                    case '*' -> ans=num1*num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }   ans=num1/num2;
                    }
                    default -> {
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }   ans=num1%num2;
                    }
                }
                System.out.println("Your Answer is :" + ans);
            }
             
            else {
                System.out.println("Invalid Operation");
            }
        }

    }
}
