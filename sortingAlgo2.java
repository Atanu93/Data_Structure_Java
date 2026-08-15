public class sortingAlgo2 {

    static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static void sortedArray(int[] arr) {

        int n = arr.length;
        int x = -1, y = -1;

        // corner cases
        if (n <= 1) {
            return;
        }

        // it starts from 1 to n because first element has no previous element
        for (int i = 1; i < n; i++) {
            // condition
            if (arr[i - 1] > arr[i]) {
                if (x == -1) { // first conflict
                    x = i - 1;
                    y = i;

                } else { // 2nd conflict
                    y = i;
                }
            }
        }

        // swap x, y in num
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 6, 7, 8, 9, 3 };
        sortedArray(arr);
        displayArray(arr);
    }
}
