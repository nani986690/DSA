import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};

        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, temp);
        }

        System.out.println(Arrays.toString(arr));
    }
}
