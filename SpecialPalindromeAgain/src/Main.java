import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String word = scan.next();

        System.out.println(subStrings(word,n));
    }
    static int subStrings(String str, int n){

        int count = 0;
        for (int i = 0; i < n; i++){

            for (int j = i + 1; j <= n; j++){
                //System.out.println(str.substring(i,j));
                if (isPalindrome(str.substring(i,j).trim())){
                    count++;
                    System.out.println(str.substring(i,j));
                }
            }
        }
        return count;
    }
    static boolean isPalindrome(String word){

        boolean palindrome = true;

        StringBuilder sb = new StringBuilder(word);
        StringBuilder sb1 = new StringBuilder();
        sb1.append(sb);
        sb1 = sb1.reverse();

        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) != sb1.charAt(i)){
                palindrome = false;
            }
        }

        return palindrome;
    }
}
