import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T=input.nextInt();

        for(int i=1;i<=T;i++){
            int a=input.nextInt();
            int b=input.nextInt();

            int result=1;

            for(int j=1;j<=b;j++){
                result=(result*a)%10;
            }

            if(result==0){
                result=10;
            }

            System.out.println(result);
        }


    }
}