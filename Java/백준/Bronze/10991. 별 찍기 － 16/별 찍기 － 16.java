import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
                if(j<i) {
                    System.out.print(" ");

                }
            }

            System.out.println();
        }

        }
    }
