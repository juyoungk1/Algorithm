import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count=0;
        for (int i=0; i<8; i++) {
            String mal=input.nextLine();
            for (int j=0; j<8; j++) {


                if((i+j)%2==0){
                    if(mal.charAt(j) == 'F'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);



    }
}