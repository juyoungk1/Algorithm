import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }


        int price1=Math.min(arr1[0],Math.min(arr1[1],arr1[2]));
        int price2=Math.min(arr2[0],arr2[1]);

        int totalPrice=price1+price2-50;
        System.out.println(totalPrice);




    }
}