import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scan.nextLine();
        String word = str.replaceAll(" ","");
        encryption(word);
    }
    static void encryption(String str){

        int row = (int)Math.floor(Math.sqrt(str.length()));
        int column  = (int)Math.ceil(Math.sqrt(str.length()));

        for ()
    }
}
