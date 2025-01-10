
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        int left = m + 1;
        int right = arr.size() - 1;

        // Perform a two-pointer swap
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            // Move the pointers
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int m = 2;

        Solution.reverseArray(arr, m);
        System.out.println(arr); // Output: [1, 2, 3, 4, 6, 5]
    }
}
