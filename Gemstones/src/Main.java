import java.util.Scanner;


public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.next();
        }
        System.out.println(gemsCount(arr));
    }
    static int gemsCount(String[] arr){
        
    }
}
