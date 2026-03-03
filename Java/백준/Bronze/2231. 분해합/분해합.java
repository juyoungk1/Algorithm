import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        int result=0;

        for(int i=1;i<=N;i++){
            int number=i;
            int sum=i;

            while(number>0){
                sum+=(number%10);

                number=number/10;
            }

            if(sum==N){
                result=i;
                break;
            }
        }
        System.out.println(result);


    }
}