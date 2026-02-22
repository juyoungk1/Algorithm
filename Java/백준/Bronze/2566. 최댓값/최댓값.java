import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int max=-1;
        int maxIndex1=0;
        int maxIndex2=0;
        for (int i=1; i<=9;i++) {
            for (int j=1; j<=9;j++) {
                int num=input.nextInt();
                if (num>max){
                    max=num;
                    maxIndex1=i;
                    maxIndex2=j;
                }

            }
        }
        System.out.println(max);
        System.out.println(maxIndex1+" "+maxIndex2);


    }
}