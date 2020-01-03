import java.util.Scanner;

public class Main {

    static boolean[] prime = new boolean[9999999];
    static int max = 9999999;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextLong();
        }
        isPrime();
        isTPrime(arr);
    }
    static void isPrime(){

        for(int i = 2; i < max; i++){
            prime[i] = true;
        }
        for (int factor = 2; factor*factor < max; factor++){

            if (prime[factor]){

                for (int i = factor * factor; i < max; i += factor){
                    prime[i] = false;
                }
            }
        }
    }
    static void isTPrime(long[] arr){

        for(int i = 0; i < arr.length; i++){
            double sqr = (int)Math.sqrt(arr[i]);;
            //System.out.println(sqr);
            if (prime[(int)sqr] && (sqr * sqr == arr[i])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
