import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T=input.nextInt();

        for(int i=1;i<=T;i++){
            int H=input.nextInt();
            int W=input.nextInt();
            int N=input.nextInt();

            int floor;
            int room;

            if(N%H==0){
                floor=H;
                room=N/H;
            }else{
                floor=N%H;
                room=(N/H)+1;
            }

            int roomNumber=(floor*100)+room;
            System.out.println(roomNumber);
        }



    }
}