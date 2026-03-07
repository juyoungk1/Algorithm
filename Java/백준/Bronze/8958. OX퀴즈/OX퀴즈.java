import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=input.nextInt();


        for(int i=0;i<n;i++){
            String s=input.next();

            int totalScore=0;
            int combo=0;

            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);

                if(ch=='O'){
                    combo++;

                    totalScore+=combo;
                }else if(ch=='X'){
                    combo=0;
                }
            }
            System.out.println(totalScore);


        }


    }
}