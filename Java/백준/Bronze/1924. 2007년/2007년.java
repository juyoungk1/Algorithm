import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x=input.nextInt();
        int y=input.nextInt();

        int[] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek={"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int totalDays=0;
        for(int i=1;i<x; i++){
            totalDays+=monthDays[i];
        }
        totalDays+=y;

        int dow=totalDays%7;

        if(dow==1){
            System.out.println(dayOfWeek[1]);
        }else if(dow==2){
            System.out.println(dayOfWeek[2]);
        }else if(dow==3){
            System.out.println(dayOfWeek[3]);
        }else if(dow==4){
            System.out.println(dayOfWeek[4]);
        }else if(dow==5){
            System.out.println(dayOfWeek[5]);
        }else if(dow==6){
            System.out.println(dayOfWeek[6]);
        }else if(dow==0){
            System.out.println(dayOfWeek[0]);
        }



    }
}