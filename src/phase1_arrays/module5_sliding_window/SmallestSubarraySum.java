package phase1_arrays.module3_sliding_window;
public class SmallestSubarraySum {

    public static int smallestSubarray(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // Expand window
            sum += arr[right];

            // Shrink window while condition is satisfied
            while (sum >= k) {

                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                }

                sum -= arr[left];
                left++;
            }
        }

        // If no valid subarray found
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 7;

        int result = smallestSubarray(arr, k);

        if (result == 0) {
            System.out.println("No valid subarray found");
        } else {
            System.out.println("Smallest subarray length: " + result);
        }
    }
}