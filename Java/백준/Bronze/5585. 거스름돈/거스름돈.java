import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int totalChange=1000-n;
        int[] coins = {500, 100, 50, 10, 5, 1};
        int count=0;

        for(int i=0;i<coins.length;i++){
            count+=totalChange/coins[i];

            totalChange=totalChange%coins[i];

        }
        System.out.println(count);


    }
}