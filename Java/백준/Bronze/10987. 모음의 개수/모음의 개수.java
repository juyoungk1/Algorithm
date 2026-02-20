import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String S=input.next();

        int count=0;
        for (int i=0;i<S.length();i++){
            char ch=S.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

        }
        System.out.println(count);


    }
}