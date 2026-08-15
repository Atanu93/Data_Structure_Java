public class RotatedArrayP2 {

    // Duplicate elements in a sorted array
    static boolean searchInArray(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid_idx = st + (end - st) / 2;
            if (arr[mid_idx] == target)
                return true;

            if (arr[st] == arr[mid_idx] && arr[mid_idx] == arr[end]) {
                ++st;
                --end;
            } else if (arr[mid_idx] <= arr[end]) {

                if (target > arr[mid_idx] && target <= arr[end]) {
                    st = mid_idx + 1;
                } else {
                    end = mid_idx - 1;
                }
            } else {

                if (target >= arr[st] && target < arr[mid_idx]) {
                    end = mid_idx - 1;
                } else {
                    st = mid_idx + 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 2, 3, 1, 1 };
        int target = 2;

        System.out.println("Search a target in a duplicate sorted Array and the element is present in the array :" + searchInArray(arr, target));
    }
}
