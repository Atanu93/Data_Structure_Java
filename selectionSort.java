public class selectionSort {

    static void selectionSorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // i represent the current index

            // find the minimum element in unsorted part of the arr

            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap curr element and minimum element -> current index i will have current
            // element
            // a[min_index], arr[i]
            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 1, 2 };
        selectionSorting(arr);

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}