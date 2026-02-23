import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int N=input.nextInt();
            int M=input.nextInt();

            if(N==0 && M==0){
                break;
            }

            if (M%N == 0){
                System.out.println("factor");
            }else if(N%M==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }

    }
}
