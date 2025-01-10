import java.util.* ;

public class Solution {
    public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries, int n, int q) {
        // Sort the array to enable efficient calculation
        Collections.sort(arr);

        // Create a prefix sum array for `arr`
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr.get(0));
        for (int i = 1; i < n; i++) {
            prefixSum.add(prefixSum.get(i - 1) + arr.get(i));
        }

        // Create a result list to store answers to each query
        ArrayList<Integer> result = new ArrayList<>();

        for (int query : queries) {
            // Find the index of the largest element <= query using binary search
            int idx = upperBound(arr, query);

            // If no elements <= query, add 0 to the result
            if (idx == -1) {
                result.add(0);
            } else {
                // Otherwise, use the prefix sum array to calculate the sum
                result.add(prefixSum.get(idx));
            }
        }

        return result;
    }
    private static int upperBound(ArrayList<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= target) {
                ans = mid; // Possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}