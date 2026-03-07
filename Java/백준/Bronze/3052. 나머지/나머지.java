import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean[] check=new boolean[42];

        for (int i = 0; i < 10; i++) {
           int n=input.nextInt();

           int m=n%42;

           check[m]=true;

        }
        int count=0;
        for (int i = 0; i < check.length; i++) {
            if (check[i]==true) {
                count++;
            }
        }
        System.out.println(count);

    }
}