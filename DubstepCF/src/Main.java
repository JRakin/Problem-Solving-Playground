import java.util.Scanner;

public class Main {

    private static final  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String sen = scan.next();
        dubStep(sen);

    }
    private static void dubStep(String sen){
        String[] word = sen.split("WUB");

        for(String s : word) {
            System.out.print(s + " ");
        }
    }
}
