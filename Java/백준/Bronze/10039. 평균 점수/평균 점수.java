import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
            if (arr[i]<40){
                arr[i] = 40;
            }
        }

        int avg=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
        System.out.println(avg);


    }
}