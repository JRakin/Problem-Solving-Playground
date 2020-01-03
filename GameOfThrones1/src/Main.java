import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String word = scan.next();
        System.out.println(game(word));
    }
    static String game(String word){
        int[] count = new int[26];
        //boolean isRight = true;
        int b = 0;

        for(int i = 0; i < word.length(); i++){
            count[word.charAt(i) - 97]++;
        }

        for (int i = 0; i < count.length; i++){
            if (count[i] != 0){
                if (count[i] % 2 != 0){
                    b++;
                }
            }
        }
        if (word.length() % 2 == 0 && b == 0){
            return "YES";
        }
        else if (word.length() % 2 != 0 && b == 1){
            return "YES";
        }
        else {
            return "NO";
        }

    }
}
