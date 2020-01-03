import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(cakeWalk(arr));
    }
    static long cakeWalk(int[] arr){
        Arrays.sort(arr);

        long sum = 0;
        int k = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            sum += arr[i] * (Math.pow(2,k++));
        }

        return sum;
    }
}
