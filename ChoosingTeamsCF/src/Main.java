import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(chooseTeam(arr, k));
    }
    static int chooseTeam(int[] arr, int k){
        Arrays.sort(arr);

        int countTeam = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if ((arr[i] + k) > 5){
                break;
            }
            else{
                count++;

                if (count == 3){
                    countTeam++;
                    count = 0;
                }
            }
        }
        return countTeam;
    }
}
