package phase1_arrays.module1_traversal;

public class PrefixSumExample {
    public static int[] buildPrefix(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1 ; i < arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int sumRangeUsingPrefix(int[] prefix,int L ,int R){
        if (L==0){
            return prefix[R];
        }
        return prefix[R]-prefix[L-1];
    }

    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10};
        int[] prefix = buildPrefix(arr);
        System.out.println("Sum 1 to 3: " + sumRangeUsingPrefix(prefix, 1, 3));
        System.out.println("Sum 0 to 4: " + sumRangeUsingPrefix(prefix, 0, 4));
        System.out.println("Sum 2 to 2: " + sumRangeUsingPrefix(prefix, 2, 2));


    }
}
