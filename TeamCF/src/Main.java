import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();

        int problem = 0;

        while(n-- > 0){
            int[] arr = new int[3];
            int count = 0;

            for (int i = 0; i < 3; i++){
                arr[i] = scan.nextInt();

                if (arr[i] == 1){
                    count++;
                }
            }

            if (count >= 2){
                problem++;
            }
        }

        System.out.println(problem);
    }
}
