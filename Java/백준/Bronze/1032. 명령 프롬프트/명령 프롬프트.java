import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        char[] pattern = input.next().toCharArray();

        for(int i=1; i<N; i++){
            String s=input.next();

            for(int j=0; j<pattern.length; j++){
                if(pattern[j]!=s.charAt(j)){
                    pattern[j]='?';
                }
            }


        }
        System.out.println(pattern);



    }
}