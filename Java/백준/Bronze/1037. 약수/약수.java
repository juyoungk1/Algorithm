import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=1;i<=n;i++){
            int a=input.nextInt();

            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }

        }
        System.out.println(max*min);





    }
}