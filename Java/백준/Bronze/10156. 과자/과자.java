import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int K=input.nextInt();
        int N=input.nextInt();
        int M=input.nextInt();

        int price=K*N;
        int money=price-M;

        if (price<M){
            System.out.println("0");
        }else{
            System.out.println(money);
        }


    }
}