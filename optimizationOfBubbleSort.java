public class optimizationOfBubbleSort {

    static void bubbleSorting(int[] arr) {
        int n = arr.length;
        boolean flag = false; //has any swapping happens

        // n-1 iterations/passes

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // last i elements are already at sorted positions, so need to check them

                if (arr[j] > arr[j + 1]) {
                    
                    // swap , arr[j], arr[j+1]
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; //some swap has happen
                }
            }
        
            if(flag == false){ //has any swaps happened
                return;
            }
        
        }

    }


    //in the worst case it takes o(n^2) but in the best case it takes o(n)

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};

        bubbleSorting(arr);

        for (int e : arr) {

            System.out.print(e + " ");

        }
    }
}
