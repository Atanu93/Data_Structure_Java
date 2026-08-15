public class countSort {

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;
    }

    static void basicCountSort(int[] arr) {
        // find the largest element from the
        int max_element = findMax(arr);
        int[] count = new int[max_element + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void Sort(int[] arr) {
        int n = arr.length;
        int[] output_arr = new int[n];

        // find the largest element from the
        int max_element = findMax(arr);
        int[] count = new int[max_element + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // Tc -> n times
        }

        // make prefix sum of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1]; // TC -> max_element + 1
        }

        // find the index of each element in the original array and put it in output
        // array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output_arr[idx] = arr[i];
            count[arr[i]]--; // Tc - > n times
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

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 2, 5 };
        // basicCountSort(arr);
        Sort(arr);
        display(arr);
    }
}
