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
