public class FirstOccurence {

    static int firstOcurrencesByBinarySearch(int[] arr, int x) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int fo = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                fo = mid;
                r = mid - 1;
            } else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return fo;
    }

    static int lastOcurrencesByBinarySearch(int[] arr, int x) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int lo = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                lo = mid;
                l = mid + 1;
            } else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 5, 6, 4, 7, 8 };
        int x = 2;

        System.out.println("First occurrence: " + firstOcurrencesByBinarySearch(arr, x));
        System.out.println("Last occurrence: " + lastOcurrencesByBinarySearch(arr, x));
    }

}
