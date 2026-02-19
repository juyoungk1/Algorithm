import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D=input.nextInt();


        int totalTime=(A*3600)+(B*60)+C+D;

        int second=totalTime%60;
        int minute=(totalTime/60)%60;
        int hour=(totalTime/3600)%24;

        System.out.println(hour+" "+minute+" "+second);

        input.close();





    }
}