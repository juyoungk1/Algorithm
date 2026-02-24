import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");

            if(i>1){
                for(int j=1;j<=(i-1)*2-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        }
    }
