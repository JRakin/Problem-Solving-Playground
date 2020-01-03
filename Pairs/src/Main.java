import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int difference = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        //System.out.println(pairs(arr, difference));
        System.out.println(findPairs(arr, difference));
    }
    static int pairs(int[] arr, int d){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            map.put(arr[i],i);
        }

        for (int i = 0; i < map.size(); i++){
            int complement = arr[i] + d;
            if (map.containsKey(complement)){
                count++;
            }
        }

        return count;
    }
    //using sorting and binary search
    static int findPairs(int[] arr, int d){
        Arrays.sort(arr);

        int l = 0;
        int r = 0;

        int count = 0;

        while(r < arr.length){

            if (arr[r] - arr[l] == d){
                count++;
                r++;
                l++;
            }
            else if (arr[r] - arr[l] > d){
                l++;
            }
            else{
                r++;
            }
        }
        return count;
    }
}
