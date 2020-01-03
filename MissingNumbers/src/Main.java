import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] brr = new int[m];

        int min  = arr[0];
        for (int i = 0; i < brr.length; i++){
            brr[i] = scan.nextInt();

            if (min > brr[i]){
                min = brr[i];
            }
        }
        for (int i = 0; i < missingNumbers(arr,brr,min).length; i++){
            if (missingNumbers(arr,brr,min)[i] > 0){
                System.out.print((min + i)+" ");
            }
        }
    }
    static int[] missingNumbers(int[] arr, int[] brr, int min){
        int[] count = new int[101];

        for (int anArr : arr) {
            count[anArr - min]--;
        }
        for (int anArr : brr){
            count[anArr-min]++;
        }

        /*for (int i = 0; i < count.length; i++){
            if (count[i] > 0){
                System.out.print((min+i)+ " ");
            }
        }*/

        return count;
    }
}
