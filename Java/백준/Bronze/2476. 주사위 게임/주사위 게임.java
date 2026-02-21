import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int N = input.nextInt();

        int maxPrice=0;

        for(int i = 0; i < N; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int price=0;

            if (a == b && b == c) {
                price=10000 + a * 1000;

            }
            else if (a == b || a == c) {
                price=1000 + a * 100;

            }
            else if (b == c) {
                price=1000 + b * 100;

            }
            else {
                int max = Math.max(a, Math.max(b, c));
                price=max*100;
            }

            maxPrice=Math.max(maxPrice, price);
        }
        System.out.println(maxPrice);


        input.close();
    }
}