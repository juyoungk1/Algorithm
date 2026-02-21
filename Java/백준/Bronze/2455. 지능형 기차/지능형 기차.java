import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[4];

        int current=0;
        int max=0;


        for(int i=0;i<arr.length;i++){
            int out=input.nextInt();
            int in=input.nextInt();

            current=current-out+in;

            max=Math.max(max,current);
        }

        System.out.println(max);





    }
}