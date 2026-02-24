import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();

        int maxX=-10000;
        int maxY=-10000;
        int minX=10000;
        int minY=10000;


        for (int i = 1; i <= N; i++) {
            int x=input.nextInt();
            int y=input.nextInt();

            maxX=Math.max(x, maxX);
            maxY=Math.max(y, maxY);
            minX=Math.min(x, minX);
            minY=Math.min(y, minY);

        }
        int cal=(maxX-minX)*(maxY-minY);
        System.out.println(cal);


    }
}