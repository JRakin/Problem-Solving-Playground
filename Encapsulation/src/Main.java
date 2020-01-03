public class Main {

    public static void main(String[] args) {
        /*Player player = new Player();

        player.name = "Rakin";
        player.health = 30;
        player.weapon = "HK-416";

        player.loseHealth(10);
        System.out.println("Remaining health "+player.remainingHealth());*/

        EnhancedPlayer player = new EnhancedPlayer("Rakin", 50, "AK-12");
        System.out.println("health is "+player.getHealth());
    }
}
