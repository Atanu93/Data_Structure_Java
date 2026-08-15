public class lexicogarphicalOrder {

    static void lexicogarphicalOrderUsingSelectionSort(String[] juicy){
        int n = juicy.length;

        for(int i = 0; i < n - 1; i++){
            
            int min_index = i;

            for(int j = i + 1; j < n; j++){
                if(juicy[j].compareTo(juicy[min_index]) < 0){
                    min_index = j;
                }
            }

            //Swap 
            String temp = juicy[min_index];
            juicy[min_index] = juicy[i];
            juicy[i] = temp;
        }
    }
    public static void main(String[] args) {
        //By using selection sort in string method

        String[] names = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        lexicogarphicalOrderUsingSelectionSort(names);

        for (String fruits : names) {
            System.out.print(fruits + " ");
        }
    }
}
