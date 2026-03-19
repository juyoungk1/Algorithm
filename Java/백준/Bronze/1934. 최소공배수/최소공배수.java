import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T=input.nextInt();



        for(int i=0;i<T;i++){
            int A=input.nextInt();
            int B=input.nextInt();

            int tempA=A;
            int tempB=B;


            while(B!=0){
                int R=A%B;
                A=B;
                B=R;
            }
            int GCD=A;
            int LCM=(tempA*tempB)/GCD;
            System.out.println(LCM);


        }



    }
}