import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N=input.nextInt();
        double[] grades=new double[N];
        double M=-1;
        double[] newGrades=new double[N];
        double sum=0;

        for(int i=0; i<N; i++){
            grades[i]=input.nextInt();

            if(grades[i]>M){
                M=grades[i];
            }



        }
        for(int i=0; i<N; i++){
            newGrades[i]=(grades[i]/M)*100;
            sum=sum+newGrades[i];
        }

        double newAvg=sum/N;
        System.out.println(newAvg);
    }
}