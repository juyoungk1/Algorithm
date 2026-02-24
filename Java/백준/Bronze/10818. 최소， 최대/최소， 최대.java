import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();

        int max=-1000000;
        int min=1000000;

        for (int i=1; i<=N; i++) {
            int number=input.nextInt();


            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println(min+" "+max);


    }
}