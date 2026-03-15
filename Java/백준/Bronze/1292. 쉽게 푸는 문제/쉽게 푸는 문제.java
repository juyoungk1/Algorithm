import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A=input.nextInt();
        int B=input.nextInt();

        int index=1;


        int[] s=new int[1001];

        for(int i=1; i<=1000; i++){
            for(int j=0; j<i; j++){
                if(index>1000){
                    break;
                }
                s[index]=i;
                index++;
            }
        }
        int sum=0;
        for(int i=A; i<=B; i++){
            sum+=s[i];
        }
        System.out.println(sum);
    }
}