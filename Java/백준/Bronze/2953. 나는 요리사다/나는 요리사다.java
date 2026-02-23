import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxScore=0;
        int winnerNum=0;

        for (int i=1;i<=5;i++){
            int sum=0;
            for (int j=1;j<=4;j++){
                int score=input.nextInt();
                sum+=score;
            }
            if (sum>maxScore){
                maxScore=sum;
                winnerNum=i;
            }
        }
        System.out.println(winnerNum+" "+maxScore);

    }
}