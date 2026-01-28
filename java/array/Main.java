// EASSY Second Largest Element in an Array.
// Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.
// Note: If the second largest element does not exist, return -1.
// Examples:-1
// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Example:-2
// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.
//===>>
package array;

public class Main {

    public static int secondLargestElement(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int smallestSec = Integer.MIN_VALUE;
        for (int nums : arr) {
            if (nums > largest) {
                smallestSec = largest;
                largest = nums;
            } else if (nums < largest && nums > smallestSec) {
                smallestSec = nums;
            }

        }
        return (smallestSec == Integer.MIN_VALUE) ? -1 : smallestSec;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99};
        System.out.println("Second Largest Element: " + secondLargestElement(arr)); // Output: 45
    }
}
