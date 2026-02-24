import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String T=input.next();

        String reverseWord=new StringBuilder(T).reverse().toString();

        if(T.equals(reverseWord)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }



        }
    }
