package phase1_arrays.module1_traversal;
public class SecondMaximum {

    public static int secondMax(int[] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second distinct maximum found");
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 9, 1, 6};

        int result = secondMax(arr);

        System.out.println("Second Maximum: " + result);
    }
}
