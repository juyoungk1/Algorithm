import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i <= 9; i++) {
            int num = input.nextInt();
            if (num>max){
                max=num;
                maxIndex=i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);


    }
}