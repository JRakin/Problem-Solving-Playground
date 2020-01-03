import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scan.nextInt();

        while(t-- > 0){
            int m = scan.nextInt();
            int n = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = scan.nextInt();
            }
            twoSum(arr,m);
        }
    }
    static void twoSum(int[] arr, int money){
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for (int i = 0; i < arr.length; i++){
            int complement = money - arr[i];

            if (table.containsKey(complement)){
                System.out.println((table.get(complement))+" "+(i+1));
            }
            table.put(arr[i],i+1);
        }
    }
}
