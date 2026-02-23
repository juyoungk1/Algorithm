import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();

            if (a==0 && b==0 && c==0){
                break;
            }

            int max=Math.max(a,Math.max(b,c));
            int other=a+b+c-max;

            if(max >= other){
                System.out.println("Invalid");
            }else if (a==b && b==c){
                System.out.println("Equilateral");
            }else if(a==b || b==c || c==a){
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }
    }
}