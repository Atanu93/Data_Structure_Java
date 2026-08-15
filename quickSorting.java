public class quickSorting {

    static void displayArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void swap (int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;

        for(int i = st + 1; i <= end; i++){
            if(arr[i] <= pivot) cnt++;
        }

        int pivotIndx = st + cnt;
        swap(arr, st, pivotIndx);
        int i = st, j = end;


        //elements lesser or equal left of pivotIndx, greater -> right side of pivotIndx
        while(i < pivotIndx && j > pivotIndx){
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if(i < pivotIndx && j > pivotIndx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndx;
    };

    static void quicksort(int[] arr, int st, int end){
        if (st >= end) {
            return;
        }

        int pi = partition(arr, st, end);
        quicksort(arr, st, pi - 1);
        quicksort(arr, pi + 1, end);

    };

    public static void main(String[] args) {
        //  int[] arr = {6, 3, 1, 5, 4};
         int[] arr = {6, 3, 1, 5, 7, 6, 7};
         int n = arr.length;
         System.out.println("Array before sorting");
         displayArr(arr);
        System.out.println();


        quicksort(arr, 0, n-1);


        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
