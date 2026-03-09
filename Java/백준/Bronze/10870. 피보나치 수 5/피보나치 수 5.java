import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();

        int sum=0;
        int[] fibonacci=new int[21];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2;i<=n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
        System.out.println(fibonacci[n]);



    }
}