import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        int copy=N;
        int count=0;

        while(true){

            int a=copy/10;
            int b=copy%10;

            int sum=a+b;

            copy=(b*10)+(sum%10);

            count++;

            if(copy==N){
                break;
            }

        }
        System.out.println(count);


    }
}