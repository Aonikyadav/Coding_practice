
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[] , int low , int high , int target) {
        
        if(low>high) {
            return -1;
        }
        int mid =low+(high-low)/2;
        if(arr[mid]==target) {
            return mid; }
            else if (arr[mid] < target) {
                return binarySearch(arr, mid+1 , high , target);
            }
            else {
                return binarySearch(arr, low , mid-1 , target);
            }

            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array element : ");
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target =  sc.nextInt();
        System.out.println("Original array : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        int result = binarySearch(arr, 0 , arr.length-1 , target);
        System.out.println("Index of target value after sorting the Array : " + result);
    }
    
}