package phase1_arrays.module2_two_pointers;
public class RotateArray {

    // Reverse helper (core reusable pattern)
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Rotate array to the right by k steps
    public static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        if (n == 0) return;

        // Important: handle k > n
        k = k % n;

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    // Test
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}