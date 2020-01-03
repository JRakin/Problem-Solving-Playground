import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scan.nextInt();

        while(t-- > 0){
            int n = scan.nextInt();
            System.out.println(factorial(n));
        }
    }
    static BigInteger factorial(int n){
        BigInteger result = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        while(!result.equals(BigInteger.ZERO)){
            sum = sum.add(result.mod(BigInteger.valueOf(10)));
            result = result.divide(BigInteger.valueOf(10));
        }

        return sum;
    }
}
