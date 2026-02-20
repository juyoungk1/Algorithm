import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X=input.nextInt();
        int N=input.nextInt();

        int sum=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            int a=input.nextInt();
            int b=input.nextInt();

            sum+=a*b;
        }
        
        if(X==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}