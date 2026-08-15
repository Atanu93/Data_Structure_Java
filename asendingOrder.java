// Give an array of size n containing only 0s, 1s, 2s; sort the array in ascending order
// sort algo(others) = > O(nlogn)
//counting sort => O(n) //minimal time complexity but passes through the array twice
//so we need to sort the array in O(n) time complexity and only one pass through the array

public class asendingOrder {

    static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static void countsortApproach(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i : arr) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // time complexity = n + n = 0(n);

        int k = 0;
        for (int i = 0; i < count0; i++) {
            arr[k++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            arr[k++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            arr[k++] = 2;
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        // explore the unknown region
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // in linear time
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 0 };
        // countsortApproach(arr);
        sort012(arr);
        displayArray(arr);
    }
}
