import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scan.nextInt();
        int m = scan.nextInt();

        int min = Math.min(n,m);
        BigInteger bi1 = factorial(BigInteger.valueOf(min));

        System.out.println(bi1);

    }
    static BigInteger factorial(BigInteger bigInteger){
        BigInteger result = BigInteger.ONE;

        while(!bigInteger.equals(BigInteger.ZERO)){
            result = result.multiply(bigInteger);
            bigInteger = bigInteger.subtract(BigInteger.ONE);
        }
        return result;
    }
}
