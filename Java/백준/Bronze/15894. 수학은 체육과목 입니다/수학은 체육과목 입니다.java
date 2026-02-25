import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N=input.nextInt();
        //N=1 ->4, N=2 -> 8 N=3 -> 12, N=4 ->
        long cir=N*4;
        System.out.println(cir);
    }
}