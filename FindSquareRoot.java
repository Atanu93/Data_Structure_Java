public class FindSquareRoot {

    // Function to find the integer square root of x using binary search upto 3
    // precisions
    static double squareRoot(int x, int precision) {
        int st = 0, end = x;
        double ans = 0;

        // Find integer part
        while (st <= end) {
            int mid = st + (end - st) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                ans = mid;
                break;
            } else if (square < x) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Find decimal part
        double increment = 0.1;

        for (int i = 0; i < precision; i++) {
            while ((ans + increment) * (ans + increment) <= x) {
                ans += increment;
            }
            increment /= 10;
        }

        return ans;
    }

    static int squareRootOfX(int x) {
        int st = 0, end = x;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;

            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid; // possible answer
                st = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 24;
        System.out.println("Integer square root of " + x + " is: " + squareRootOfX(x));
        System.out.println("Square root of " + x + " with 3 decimal precision is: " + squareRoot(x, 3));
    }
}