import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int A = input.nextInt();
       int I = input.nextInt();
       //I=a/A
       int a=I*A;
       int b=(I-1)*A+1;
       int min=Math.min(a,b);
       System.out.println(min);
    }
}