//This is a linear algorithm which has linear time complexity& as well as space complexity

public class sortPositiveNegative {

    static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static void partition(int[] arr) {
        int l = 0, r = arr.length - 1;
        // int n = arr.length;

        while (l < r) {
            while (arr[l] < 0)
                l++;
            while (arr[r] >= 0)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { -13, 20, 7, 0, -4, -13, 11, -5, -13 };

        partition(arr);
        displayArray(arr);

    }
}