import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int K = input.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if(N%i==0){
                count++;
            }
            if(count==K){
                System.out.println(i);
                return;
            }

        }
        System.out.println(0);



    }
}