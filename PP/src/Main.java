public class Main extends Bike {

    @Override
    void run() {
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike b = new Main();

        b.run();

        System.out.println((int) Math.pow(2,4));

    }
}
