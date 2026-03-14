import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next().toUpperCase();


        int[] arr = new int[26];


        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            arr[ch - 'A']++;
        }
        int max=-1;
        char answer = '?';


        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max = arr[i];
                answer=(char)(i+'A');

            }else if(arr[i]==max){
                answer='?';
            }
        }
        System.out.println(answer);

    }
}