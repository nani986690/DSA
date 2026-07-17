/*Problem Statement
Given an integer array, return true if any value appears more than once, otherwise return false.
Example 1
Input:
[1,2,3,1]
Output:
true */


import java.util.*;

public class Main {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }
}
