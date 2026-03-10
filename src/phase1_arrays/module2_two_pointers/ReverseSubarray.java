package phase1_arrays.module2_two_pointers;

public class ReverseSubarray {

    // Reverse part of the array between start and end (inclusive)
    public static void reverse(int[] arr, int start, int end) {

        int left = start;
        int right = end;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        reverse(arr, 1, 4);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/