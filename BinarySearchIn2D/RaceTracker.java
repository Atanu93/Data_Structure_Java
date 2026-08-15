package BinarySearchIn2D;

public class RaceTracker {


    /* Time complexity are O(nlogn) space complexity  = o(1) 
     */

    static boolean isPossible(int[] arr, int k, int dist) {
        int kidsPlaced = 1;
        int lastPlacedKids = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - lastPlacedKids) >= dist) {
                kidsPlaced++;
                lastPlacedKids = arr[i];
            }
        }

        return kidsPlaced >= k;
    }

    static int raceTrackerPlacedKids(int[] arr, int k) {
        int n = arr.length;
        int ans = -1, st = 0, end = (int) 1e9;

        if (k > n)
            return ans;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9 };
        int kids = 2;

        System.out.println(raceTrackerPlacedKids(arr, kids));
    }
}
