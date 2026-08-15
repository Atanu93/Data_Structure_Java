public class mergeSort {

    static void displayArray(int[] arr) {

        for (int ie : arr) {
            System.out.print(ie + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        // Copy data to left array
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        // Copy data to right array
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Reset pointers
        i = 0;
        j = 0;
        k = l;

        // Merge two sorted arrays
        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of left[]
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[]
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSortingBase(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int mid_point = (l + r) / 2;

        mergeSortingBase(arr, l, mid_point);
        mergeSortingBase(arr, mid_point + 1, r);

        merge(arr, l, mid_point, r);
    }

    public static void main(String[] args) {

        int[] arr = { 7, 20, 4, 11, 8, 2 };

        int n = arr.length;

        System.out.println("Array before sorting:");
        displayArray(arr);

        mergeSortingBase(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        displayArray(arr);
    }
}