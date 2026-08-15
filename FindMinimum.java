public class FindMinimum {

    static int findMin(int[] num) {
        int p = num.length;
        int st_idx = 0, end_idx = p - 1;
        int ans = -1;

        while (st_idx <= end_idx) {
            int mid_idx = (st_idx + end_idx) / 2;
            if (num[mid_idx] <= num[p - 1]) {
                ans = mid_idx;
                end_idx = mid_idx - 1;

            } else {
                st_idx = mid_idx + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] num = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Index of minimum element: " + findMin(num));
    }
}
