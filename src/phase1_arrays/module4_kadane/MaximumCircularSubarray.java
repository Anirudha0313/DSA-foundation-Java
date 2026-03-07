package phase1_arrays.module4_kadane;

public class MaximumCircularSubarray {

    public static int kadane(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static int maxCircularSubarray(int[] arr) {

        int normalMax = kadane(arr);

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int invertedMax = kadane(arr);

        int circularMax = totalSum + invertedMax;

        if (circularMax == 0) return normalMax;

        return Math.max(normalMax, circularMax);
    }

    public static void main(String[] args) {

        int[] arr = {5,-3,5};

        System.out.println(maxCircularSubarray(arr));
    }
}