package BinarySearchIn2D;
/*  Search the 'target' value in a 2d int matrix of dimensions n * m and return true if found , else return false ...THe matrix has the following properties
1.integer in each row are sorted from left to right.
2.The first integer of each row if greater than the last integer of the previous row*/

/* Approches to solve it
1.Linear Search o(n*m)
2.Binary search with a extra 1d array space and also some time to copy the elements from the 2d arr
3.if the every row sorted then we will apply binary search in each row 
so, for n row we do logn traversing
the time complexity is o(nlogn)
 */
public class SearchIn2D {
    static boolean searchMatrix(int[][] a, int target) {
        // number of rows = n, number of colums = m
        int n = a.length, m = a[0].length;
        int st_idx = 0, end_idx = (n * m) - 1;

        while (st_idx <= end_idx) {
            int mid_idx = st_idx + (end_idx - st_idx) / 2;
            int midElt = a[mid_idx / m][mid_idx % m];

            if (midElt == target)
                return true;

            if (target < midElt) {
                end_idx = mid_idx - 1;
            } else {
                st_idx = mid_idx + 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] a = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(a, target));
    }
}
