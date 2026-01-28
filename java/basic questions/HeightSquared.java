
public class HeightSquared {

    public static void main(String[] args) {
        // Example array of heights  
        int[] height = {3, 1, 4, 1, 5, 9};

        // Call the method and print the result  
        int result = calculateSquared(height);
        System.out.println("Result: " + result);
    }

    public static int calculateSquared(int[] height) {
        int len = height.length;
        int result = 0; // Initialize result  

        for (int i = 1; i < len; i++) { // Start from 1 to avoid out-of-bounds access  
            if (height[i - 1] <= height[i]) {
                result += (int) Math.pow(height[i - 1], 2); // Accumulate the result  
            }
        }

        return result; // Return the accumulated result  
    }
}
