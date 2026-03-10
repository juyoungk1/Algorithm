import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int k = input.nextInt();
        int[] x = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = input.nextInt();

        }
        Arrays.sort(x);
        System.out.println(x[N-k]);


    }
}