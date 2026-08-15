import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    static void sort(float[] arr) {
        // need to create an bucket
        int n = arr.length;
        // arraylist

        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];

        // create an empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();

        }

        // add elements into our buckets
        for (int i = 0; i < n; i++) {
            int bucket_index = (int) arr[i] * i;
            buckets[bucket_index].add(arr[i]);
        }

        // sort every bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // merge all the buckets to get float sorted array
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[idx++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = { 0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f };
        sort(arr);
        for (float f : arr) {
            System.out.print(f + " ");
        }
    }
}
