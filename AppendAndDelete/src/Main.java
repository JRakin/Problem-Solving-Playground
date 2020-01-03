import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scan.next();
        String t = scan.next();
        int k = scan.nextByte();

        System.out.println(appendDelete(s, t, k));
    }
    static String appendDelete(String s, String t, int k){

        int length = 0;

        for (int i = 0; i < Math.min(s.length(),t.length()); i++){
            if (s.charAt(i) == t.charAt(i)){
                length++;
            }
            else{
                break;
            }
        }
        System.out.println(length);

        if (s.length() + t.length() -(2*length) > k){
            return "No";
        }
        else if(s.length() + t.length() - k < 0){
            return "Yes";
        }
        else if ((s.length() + t.length() - 2*length) % 2 == k% 2){
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
