import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int i=1;i<=T;i++){
            int C = input.nextInt();

            int q=C/25;
            C=C%25;
            int d=C/10;
            C=C%10;
            int n=C/5;
            C=C%5;
            int p=C;

            System.out.println(q+" "+ d+" "+n+" "+p);


        }
    }
}