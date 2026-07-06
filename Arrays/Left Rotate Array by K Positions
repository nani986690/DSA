import java.util.*;

class Codechef {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        k = k % arr.length;

        int[] store = new int[k];
        for (int i = 0; i < k; i++) {
            store[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = store[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
