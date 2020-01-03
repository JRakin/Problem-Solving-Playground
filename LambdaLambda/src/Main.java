import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        Drawable d =(str)->{
            String s = "you " + str;
            return s;
        };
        System.out.println(d.draw("Drawing"));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        arrayList.forEach(n -> {if(n%2 == 0) System.out.println(n);});
    }
}
