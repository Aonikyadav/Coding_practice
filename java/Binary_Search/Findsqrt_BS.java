package Binary_Search;

import java.util.Scanner;

public class Findsqrt_BS {
    public static int sqrt(int x) {
        int left=0,right=x;
        int res=-1;
        while(left<= right) {
            int mid=left+(right-left)/2;
            int target=mid*mid;
            if(target==x) {
                return mid;
            }
            else if(target<x) {
                res=mid;
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        int result=sqrt(value);
        System.out.println(result);
    }
}
