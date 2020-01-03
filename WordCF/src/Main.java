import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String word = scan.next();
        System.out.println(changedWord(word));
    }
    static String changedWord(String word){
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122){
                count++;
            }
            else {
                count1++;
            }
        }

        if (count >= count1){
            StringBuilder sb = new StringBuilder(word.toLowerCase());
            return sb.toString();
        }
        else {
            StringBuilder sb = new StringBuilder(word.toUpperCase());
            return sb.toString();
        }
    }
}
