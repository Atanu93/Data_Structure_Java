package Strings;

public class stringBuilder {

  static void reverseAString(String str) {
    char[] arr = str.toCharArray();

    int i = 0, j = arr.length - 1;

    while (i < j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }

    System.out.println(new String(arr));
}

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        System.out.println("My new String : " + str);

        // Hello => Cello
        str.setCharAt(0, 'C');
        System.out.println("My second new String : " + str);

        // Append an integer , float etc
        str.append(18);
        System.out.println(str);

        // insertion In string and deletion
        str.insert(2, 'y');
        str.deleteCharAt(0);
        System.out.println(str);
    }
}
