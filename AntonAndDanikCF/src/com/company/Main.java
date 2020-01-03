

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(game(str));
    }
    static String game(String word){
        char[] arr = word.toUpperCase().toCharArray();

        int countA = 0;
        int countB = 0;

        for(int i = 0; i < arr.length;){
            if(arr[i] == 65){
                countA++;
                i++;
            }
            else{
                countB++;
                i++;
            }
        }
        if(countA == countB){
            return "Friendship";
        }
        else if(countA > countB){
            return "Anton";
        }
        else{
            return "Danik";
        }
    }
}
