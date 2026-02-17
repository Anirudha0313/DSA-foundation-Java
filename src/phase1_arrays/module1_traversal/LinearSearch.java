package phase1_arrays.module1_traversal;

import java.util.Scanner;

public class LinearSearch {
//    public static int linearSearch(int[] arr, int target) {
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == target) {
//                    return i;
//                }
//            }
//
//            return -1;
//        }
//
//        public static void main(String[] args) {
//
//            int[] arr = {3, 8, 1, 4};
//            int target = 6;
//
//            int result = linearSearch(arr, target);
//
//            if (result != -1) {
//                System.out.println("Found at index: " + result);
//            } else {
//                System.out.println("Not found");
//            }
//        }

    public static int LS(int[] arr , int target){
        for (int i = 0; i<arr.length ; i++ ){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Target element ");
        int target = sc.nextInt();
        int result = LS(arr, target);
        if (result != -1){
            System.out.println("Found at index: " + result);
        }else {
            System.out.println("Not found");
        }
    }
    }


