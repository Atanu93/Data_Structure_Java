package OOPs;

import java.util.Arrays;

public class ArrayList {

    public static class InnerArrayList {

        int[] arr = new int[5];
        int idx = 0;
        int size = 0;

        public void add(int ele) {
            if (size == arr.length) {
                arr = Arrays.copyOf(arr, arr.length * 2);
                arr = new int[arr.length];
                arr = Arrays.copyOf(arr, arr.length);
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
    }

    public static void main(String[] args) {
        InnerArrayList arr = new InnerArrayList();
        arr.add(4);
        arr.add(8);
        arr.add(7);
        arr.add(73);
        arr.add(74);
        arr.add(744);
        System.out.println(arr.size);
    }
}
