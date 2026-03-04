import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        int count=1;
        int range=1;

        while (range<N){
            range=range+(6*count);
            count++;

        }
        System.out.println(count);


    }
}