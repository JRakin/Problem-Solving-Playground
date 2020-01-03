import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(minimumPrice(arr, k));
    }
    static int minimumPrice(int[] arr, int k){
        int sum = 0;
        Arrays.sort(arr);

        int buy = 0;
        int index = 0;

        for (int i = arr.length-1; i >= 0; i--){
            sum += (index + 1)*arr[i];
            buy++;

            if(buy == k){
                buy = 0;
                index++;
            }
        }

        return sum;
    }
}
