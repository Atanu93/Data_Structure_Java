public class keypadCombinations {

    static void combinations (String dig, String[] kpCombo, String ans){
        //Base case
        if (dig.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

     
        int currDig = dig.charAt(0) - '0'; //2
        String currChoices = kpCombo[currDig]; // "abc"


        //Recursive calls ---
        for(int i = 0; i < currChoices.length(); i++){
            combinations(dig.substring(1), kpCombo, ans + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "253";
        String[] kpCombo = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combinations(dig, kpCombo, "");
    }
}