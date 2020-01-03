import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++){
            players[i] = new Player(scan.next(),scan.nextInt());
        }
        Arrays.sort(players,checker);

        IntStream.range(0, players.length).forEach(i -> System.out.printf("%s %s\n", players[i].name, players[i].score));
    }
}
