import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] count = new int[1001];
        int m = scan.nextInt();

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 1001; i++){
            count[i] = 0;
        }
        for (int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        while (m-- > 0){
            int number = scan.nextInt();

            if (count[number] != 0){
                System.out.println(count[number]);
            }
            else {
                System.out.println("NOT PRESENT");
            }
        }
    }
}
