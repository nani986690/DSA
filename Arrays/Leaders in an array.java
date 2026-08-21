import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr[arr.length - 1];

        // Last element is always a leader
        leaders.add(maxRight);

        // Go from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }

        // Reverse to get left-to-right order
        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}
