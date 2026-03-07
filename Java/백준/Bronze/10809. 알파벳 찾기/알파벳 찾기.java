import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String S=input.nextLine();

        for(char c='a';c<='z';c++){
            System.out.print(S.indexOf(c)+" ");
        }


    }
}