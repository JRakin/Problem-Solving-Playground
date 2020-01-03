import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();

        int count = 0;

        while (n > 0 && m > 0){
            if (n == 1 && m == 1){
                break;
            }

            if (n > m){
                m--;
                n -= 2;
            }
            else {
                n--;
                m -= 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
