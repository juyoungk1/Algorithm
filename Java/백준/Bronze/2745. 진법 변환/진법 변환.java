import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N = input.next();
        int B = input.nextInt();

        int sum = 0;
        int weight = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            int num = 0;

            if (c >= '0' && c <= '9') {
                num = c - '0';
            }
            else if (c >= 'A' && c <= 'Z') {
                num = c - 'A' + 10;
            }

            sum += (num * weight);

            weight = weight * B;
        }

        System.out.println(sum);
    }
}