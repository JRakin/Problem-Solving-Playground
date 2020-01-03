import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int[] brr = flip(arr);

        for (int k = 0; k < brr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
    static int[] flip(int[] arr){
        Arrays.sort(arr);

        return arr;
    }
}
