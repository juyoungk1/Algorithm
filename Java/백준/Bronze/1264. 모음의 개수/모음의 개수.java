import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            String line = sc.nextLine();
            
            if (line.equals("#")) {
                break;
            }

            int count = 0;
            
            String lowerLine = line.toLowerCase();

            for (int i = 0; i < lowerLine.length(); i++) {
                char ch = lowerLine.charAt(i); 

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++; 
                }
            }
            
            System.out.println(count);
        }

        sc.close();
    }
}