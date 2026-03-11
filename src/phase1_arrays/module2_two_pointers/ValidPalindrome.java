package phase1_arrays.module2_two_pointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "racecar";

        System.out.println(isPalindrome(s));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/