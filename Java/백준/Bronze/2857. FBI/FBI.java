import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hasFBI=false;

       for (int i = 1; i <= 5; i++) {
           String agent=input.nextLine();
           if(agent.contains("FBI")){
               System.out.print(i+" ");
               hasFBI=true;
           }

       }
       if (!hasFBI) {
           System.out.println("HE GOT AWAY!");
       }

    }
}