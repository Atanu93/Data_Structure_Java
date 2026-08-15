public class LinearSearch {

    static boolean searchingArray(int[] arr, int n, int target) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    static boolean binarySearchApproach(int[] arr, int n, int target) {

        int st_idx = 0;
        int end_idx = n - 1;

        while (st_idx <= end_idx) {
            int mid = st_idx + (end_idx - st_idx) / 2; // There is a possibility of overflow if we do (st_idx + end_idx) / 2, so we can do st_idx + (end_idx - st_idx) / 2   
            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                end_idx = mid - 1;
            } else {
                st_idx = mid + 1;
            }
        }

        return false;
    }

    static boolean recursiveBinaryTree(int[] arr, int n, int st_idx, int end_idx, int target) {

        // base case
        if (st_idx > end_idx)
            return false;

        int mid = st_idx + (end_idx - st_idx) / 2;// There is a possibility of overflow if we do (st_idx + end_idx) / 2, so we can do st_idx + (end_idx - st_idx) / 2    

        // recursive calls
        if (arr[mid] == target) {
            return true;
        } else if (target < arr[mid]) {
            return recursiveBinaryTree(arr, n, st_idx, mid - 1, target);
        } else {
            return recursiveBinaryTree(arr, n, mid + 1, end_idx, target);
        }
    }

    public static void main(String[] args) {
        int[] num = { 5, 8, 10, 13, 15 };
        int target = 4;
        int n = num.length;
        int st_idx = 0;
        int end_idx = n - 1;

        while (target != 17) {
            // System.out.printf("%d exists in arr: %b \n", target,
            // binarySearchApproach(num, n, target));
            System.out.printf("%d exists in arr: %b \n", target, recursiveBinaryTree(num, n, st_idx, end_idx, target));
            target++;
        }

        // System.out.println(searchingArray(num, n, target));
    }
}
