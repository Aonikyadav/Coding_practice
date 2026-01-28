public class MergeSortExample {

    // Main function to run the program
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        printArray(numbers);

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("\nSorted Array:");
        printArray(numbers);
    }

    // Recursive Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // 1. Find the middle point
            int mid = (left + right) / 2;

            // 2. Sort the left half
            mergeSort(arr, left, mid);

            // 3. Sort the right half
            mergeSort(arr, mid + 1, right);

            // 4. Merge the two halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves into one sorted array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two temporary arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[]
        int i = 0, j = 0; // Initial indexes of temp arrays
        int k = left;     // Initial index of merged array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
