public class radixSort {

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output_arr = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) { // make frequency array
            count[(arr[i] / place) % 10]++; // Tc -> n times
        }

        // make prefix sum of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1]; // TC -> max_element + 1
        }

        // find the index of each element in the original array and put it in output
        // array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output_arr[idx] = arr[i];
            count[(arr[i] / place) % 10]--; // Tc - > n times
        }

        // if the function isn't return anything to save space complexity so, we are
        // coping all the
        // elements from count[arr]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output_arr[i]; // tc -> n times
        }

    };

    static void display(int[] arr) {
        for (int t : arr) {
            System.out.print(t + " ");
        }
    }

    static void sort(int[] arr) {
        int max_element = findMax(arr);
        // apply counting sort to sort elements based on place value
        for (int place = 1; max_element / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 43, 453, 626, 894, 0, 3 };
        sort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
