import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] arr = new int[5];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

            if(arr[i]==a){
                count++;
            }

        }
        System.out.println(count);



    }
}