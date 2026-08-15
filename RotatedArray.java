//Given the sorted roated array of int , which contains distinct elements, and an integer target, return the index of target if it is the array. otherwise return -1

public class RotatedArray {

    static int searchInRotatedArray(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (arr[st] <= arr[mid]) { 

                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1; 
                } else {
                    st = mid + 1;
                }

            } else { // Right half is sorted

                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 12, 1, 2, 3, 4, 5, 6 };
        int target = 12;

        System.out.println(searchInRotatedArray(arr, target));
    }
}