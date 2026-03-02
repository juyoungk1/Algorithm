import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        int count=0;
        for(int i=1;i<=N;i++){
            int a= input.nextInt();

            if(a==1){
                continue;
            }

            boolean isPrime=true;

            for(int j=2;j<a;j++){
                if(a%j==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                count++;
            }
        }
        System.out.println(count);


    }
}