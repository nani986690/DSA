/*Problem Statement 1
You are given a string with alphabets. You need to convert the string to lowercase and check if the string is a palindromic one.

If the string is a palindrome, print the length of the palindromic string. If that string is a non-palindromic one, print the ASCII value of the first character of the alphabet in the given string.

Input Format
The input consists of a single string containing only alphabetic characters (both uppercase and lowercase).

Output Format
Print the Length of the palindromic string if it is a palindrome after performing the above operations. Otherwise, print the ASCII value of the first character.*/

import java.util.Scanner;

public class Main {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                System.out.println((int) s.charAt(0));
                return;
            }
        }
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        solve();
    }
}
