import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x=input.nextInt();
        int y=input.nextInt();
        int w=input.nextInt();
        int h=input.nextInt();

        int xMin=Math.min(x,w-x);
        int yMin=Math.min(y,h-y);

        int xyMin=Math.min(xMin, yMin);
        System.out.println(xyMin);

    }
}