import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        List<String> colorList= Arrays.asList(colors);

        String c1=input.nextLine();
        String c2=input.nextLine();
        String c3=input.nextLine();

        int v1=colorList.indexOf(c1);
        int v2=colorList.indexOf(c2);
        int v3=colorList.indexOf(c3);

        long result=(v1 * 10L + v2) * (long) Math.pow(10, v3);

        System.out.println(result);



    }
}