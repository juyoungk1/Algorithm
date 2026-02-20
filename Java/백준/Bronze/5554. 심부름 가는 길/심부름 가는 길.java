import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        int sum=arr[0]+arr[1]+arr[2]+arr[3];
        int totalMinute=sum/60;
        int totalSecond=sum-(totalMinute*60);
        System.out.println(totalMinute);
        System.out.println(totalSecond);
    }
}