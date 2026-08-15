public class insertionSort {

    static void insertionSorting(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                //swap a[j], a[j-1]
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp; 
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2};
        insertionSorting(arr);


        System.out.println("The sorted Array: ");
        for (int e : arr) {
            System.out.println(e + " ");
        }
    }
}
