import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        int M=input.nextInt();

        int[] basket=new int[N+1];

        for(int a=1;a<=M;a++){
            int i=input.nextInt();
            int j=input.nextInt();
            int k=input.nextInt();

            for(int x=i;x<=j;x++){
                basket[x]=k;
            }
        }


        for(int a=1;a<=N;a++){
            System.out.print(basket[a]+" ");
        }


    }
}