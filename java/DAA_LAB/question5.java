import java.util.*;

public class question5 {
    public static int maximum(int[] arr) {
       Arrays.sort(arr);
       int nums=arr.length;
       int largest=arr[nums-1] * arr[nums-2];
       int smallest=arr[0] * arr[1];
       int answer=largest-smallest;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int length= sc.nextInt();
        int[] arr= new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();      
        }
         System.out.println("replace value :" + maximum(arr));
    }
}

// Example 1:
// Input: nums = [5,6,2,7,4]
// Output: 34

// Example 2:
// Input: nums = [4,2,5,9,7,4,8]
// Output: 64