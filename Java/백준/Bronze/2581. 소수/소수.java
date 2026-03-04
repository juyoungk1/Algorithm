import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M=input.nextInt();
        int N=input.nextInt();

        int sum=0;
        int min=-1;

        for (int i=M; i<=N; i++){

            if(i==1){
                continue;
            }

            boolean isPrime=true;
            for (int j=2; j<i; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum+=i;

                if(min==-1){
                    min=i;
                }
            }



        }
        if (min==-1){
            System.out.println(min);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }



    }
}