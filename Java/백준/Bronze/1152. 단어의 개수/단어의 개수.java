import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N=input.nextLine();


        StringTokenizer st = new StringTokenizer(N);
        st.countTokens();

        System.out.println(st.countTokens());



    }
}