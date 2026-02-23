import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger A=new BigInteger(input.next());
        String B=input.next();
        BigInteger C=new BigInteger(input.next());


        if (B.equals("*")) {
            System.out.println(A.multiply(C));
        }else if(B.equals("+")) {
            System.out.println(A.add(C));
        }

    }
}