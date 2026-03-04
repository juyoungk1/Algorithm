import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr=new int[5];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();

            sum+=arr[i];
        }
        int avg=sum/5;
        Arrays.sort(arr);
        int mid=arr[arr.length/2];

        System.out.println(avg);
        System.out.println(mid);

    }
}