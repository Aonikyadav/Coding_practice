package Binary_Search;

// public class BinarySearchs {
import java.util.Scanner;

public class BinarySearchs {

    public static int binarysearchvalue(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarysearchvalue(arr, mid + 1, right, target);
        } else {
            return binarysearchvalue(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int arrlen = arr.length;
        for (int i = 0; i < arrlen; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target value:");
        int target = sc.nextInt();

        int result = binarysearchvalue(arr, 0, arrlen - 1, target);
        if (result == -1) {
            System.out.println("Data not Found");
        } else {
            System.out.println("Data Founded at index" + result);
        }
    }
}
