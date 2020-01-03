import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int [] index = findSum(arr,m);
        System.out.println(index[0]+" "+index[1]);

    }
    static int[] findSum(int[] arr, int m){
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while(arr[low] + arr[high] != m){
            if (arr[low] + arr[high] > m){
                high--;
            }
            else {
                low++;
            }
        }
        return new int[]{low+1,high+1};
    }
}
