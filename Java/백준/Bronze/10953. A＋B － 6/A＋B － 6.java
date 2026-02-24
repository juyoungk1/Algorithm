import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T=input.nextInt();
        int sum=0;
        for(int i=1;i<=T;i++){
            String line=input.next();

            String[] numbers=line.split(",");

            int A=Integer.parseInt(numbers[0]);
            int B=Integer.parseInt(numbers[1]);

            System.out.println(A+B);

        }





    }
}