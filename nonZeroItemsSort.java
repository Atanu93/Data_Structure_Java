public class nonZeroItemsSort {

    static void movingZeroInTheEnd(int[] axe){
        int n = axe.length;
        boolean flag = false;

        //iterations
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(axe[j] == 0 && axe[j+1] != 0){
                    //if it is statisfied then we are going for a swap of the two elements
                    int temp = axe[j];
                    axe[j] = axe[j+1];
                    axe[j+1] = temp;
                    flag = true;
                }
            }

            if( flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 42};
        movingZeroInTheEnd(arr);

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
