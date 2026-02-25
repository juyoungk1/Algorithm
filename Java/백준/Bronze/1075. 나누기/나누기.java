import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int F = input.nextInt();

        int base=(N/100)*100;

        for(int i=0;i<99;i++){
            if ((base+i)%F==0){

                if(i<10){
                    System.out.print("0"+i);
                }else{
                    System.out.print(i);
                }
                break;
            }

        }

    }
}