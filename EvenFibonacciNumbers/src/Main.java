import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scan.nextInt();

        while (t-- > 0){
            long number = scan.nextLong();
            System.out.println(evenFibonacci(number));
        }
    }
    static long evenFibonacci(long number){
        long temp = 1;
        long sum = 0;

        for (long i = 1; i <= number; i++){
            long fibo = temp + i;
            temp = fibo;

            if (fibo % 2 == 0){
                sum += fibo;
            }
        }
        return sum;
    }
}
