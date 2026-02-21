package phase1_arrays.module2_prefix_sum;
public class MaximumSubarray {

    // Brute Force Approach - O(n^2)
    public static int maxSubarrayBrute(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {

            int sum = 0;

            for (int end = start; end < arr.length; end++) {

                sum += arr[end];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }


    // Kadane's Algorithm - O(n)
    public static int maxSubarrayKadane(int[] arr) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }


    // Main Method
    public static void main(String[] args) {

        int[] arr = {2, -1, 2, 3, -9};

        System.out.println("Brute Force Result: " + maxSubarrayBrute(arr));
        System.out.println("Kadane Result: " + maxSubarrayKadane(arr));
    }
}
