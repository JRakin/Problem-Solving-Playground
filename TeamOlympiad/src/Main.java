import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        teamOlympiad(arr);
    }
    static void teamOlympiad(int[] arr){
        sort(arr,0,arr.length-1);


        
    }
    static void sort(int[] arr, int low, int high){

        if (low < high){
            int part = partition(arr, low, high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
        }
    }
    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int index = low - 1;

        for (int i = low; i < high; i++){

            if (arr[i] <= pivot){
                index++;

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[index+1];
        arr[index+1] = arr[high];
        arr[high] = temp;

        return index+1;
    }
}
