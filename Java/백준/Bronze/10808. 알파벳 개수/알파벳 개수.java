import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            arr[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}