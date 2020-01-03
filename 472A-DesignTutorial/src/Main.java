import java.util.Scanner;

public class Main {

    private static int max = 9999999;
    private static boolean[] prime = new boolean[max];

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        isPrime();

        int x = 4;
        int y = n-4;

        for (int i = 1; i <= n; i++){
            if (!prime[x] && !prime[y]){
                System.out.println(x+" "+y);
                break;
            }
            x++;
            y--;
        }

    }
    static void isPrime(){

        for (int i = 2; i < max; i++){
            prime[i] = true;
        }

        for (int factor = 2; factor*factor < max; factor++){
            if (prime[factor]){
                for (int i = factor*factor; i < max; i += factor){
                    prime[i] = false;
                }
            }
        }
    }
}
