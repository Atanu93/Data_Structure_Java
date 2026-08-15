package BinarySearchIn2D;

// Minimal Maximum Chocolates Distribution

/* Time complexity of this code is O(n log m) where n is the number of chocolate packets and m is the total number of chocolates. The binary search runs in O(log m) and for each mid value, we check if the distribution is possible in O(n).
 */

public class DistributeChoclates {

    static boolean isDivisionPossible(int[] arr, int m, int maxChocolateAllowed) {
        int numOfStudents = 1;
        int chocolates = 0;

        for (int i = 0; i < arr.length; i++) {

            // If a single packet exceeds the allowed limit
            if (arr[i] > maxChocolateAllowed) {
                return false;
            }

            if (chocolates + arr[i] <= maxChocolateAllowed) {
                chocolates += arr[i];
            } else {
                numOfStudents++;
                chocolates = arr[i];
            }
        }

        return numOfStudents <= m;
    }

    static int distributeChocolatesAmongStudents(int[] arr, int m) {

        int n = arr.length;

        // More students than packets
        if (n < m) {
            return -1;
        }                                          // This takes only logn times under this we are calling a method which is O(n) so overall time complexity is O(n log m)

        int start = 0;
        int end = 0;

        // Calculate search space
        for (int chocolates : arr) {
            start = Math.max(start, chocolates);
            end += chocolates;
        }

        int answer = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isDivisionPossible(arr, m, mid)) {
                answer = mid;
                end = mid - 1; // try to minimize maximum chocolates
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // int[] arr = { 5, 3, 1, 4, 2 };
        int[] nums = {12, 34, 67, 90};
        int students = 2;

        int result = distributeChocolatesAmongStudents(nums, students);

        System.out.println("Minimum possible distributed chocolates = " + result);
    }
}