import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int cal=A*B*C;
        int[] counts=new int[10];

        while (cal >0){
            int digit=cal%10;
            counts[digit]++;

            cal=cal/10;

        }
        for(int i=0;i<10;i++){
            System.out.println(counts[i]);
        }




    }
}