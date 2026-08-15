public class bubbleSort {

    static void bubbleSorting(int[] arr) {
        int n = arr.length;

        // n-1 iterations/passes

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // last i elements are already at sorted positions, so need to check them

                if (arr[j] > arr[j + 1]) {

                    // swap , arr[j], arr[j+1]

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 9, 3, 2, 5 };

        bubbleSorting(arr);

        for (int e : arr) {

            System.out.print(e + " ");

        }
    }
}
