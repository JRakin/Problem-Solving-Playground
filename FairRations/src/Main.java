import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] bread = new int[n];

        for (int i = 0; i < n; i++){
            bread[i] = scan.nextInt();
        }
        rations(bread);
    }
    static void rations(int[] bread){

        int count = 0;

        if(!isEven(bread)){
            System.out.println("NO");
        }
        else{
            for(int i = 1; i < bread.length; i++){
                if(bread[i-1] % 2 != 0){
                    count += 2;
                    bread[i]++;
                    bread[i-1]++;
                }
            }
            System.out.println(count);
        }
    }
    static boolean isEven(int[] bread){

        int sum = 0;

        for(int i = 0; i < bread.length; i++){
            sum += bread[i];
        }

        if(sum % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
