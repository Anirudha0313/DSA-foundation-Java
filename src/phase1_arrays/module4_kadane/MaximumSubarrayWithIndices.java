package phase1_arrays.module4_kadane;

public class MaximumSubarrayWithIndices {

    public static void maxSubarray(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubarray(arr);
    }
}