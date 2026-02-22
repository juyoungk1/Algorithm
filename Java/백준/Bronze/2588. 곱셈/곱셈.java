import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int ones=B%10;
        int tens=(B/10)%10;
        int hundreds = B/100;

        int cal1=A*ones;
        int cal2=A*tens;
        int cal3=A*hundreds;
        int cal=A*B;
        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println(cal3);
        System.out.println(cal);
    }
}