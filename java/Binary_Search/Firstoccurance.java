package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Firstoccurance {

    public static int firstoccur(int [] arr, int target) {
        int len=arr.length;
        int left=0, right=len-1;
        int firstocc=-1;
        while(left<=right) {
            int mid = left+(right-left)/2;
             if(arr[mid]==target)
             {
               firstocc=mid;
               right=mid-1;
             }   
             else if(arr[mid]<target) 
             {
               left=mid+1;
             }
             else
             {
                right=mid-1;
             }
            }
            return firstocc;
         }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+ " " ); //data before sort
        }
        System.out.println();

        Arrays.sort(arr); 

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" "); //Data after sort
        }

        int target=sc.nextInt();
       int result=firstoccur(arr,target);
       if(result==-1) {
        System.out.println("False statement");
       }
       else {
        System.out.println("data "+result);
       }
    }
}
