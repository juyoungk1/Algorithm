import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int L = input.nextInt(); 
        int P = input.nextInt(); 

        int h = L * P; 

        for (int i = 0; i < 5; i++) {
            int article = input.nextInt();
            System.out.print((article - h) + " ");
        }

        input.close();
    }
}