public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi("A8 2019", 8);

        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Porsche porsche = new Porsche("911 gtRS2", 12);

        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());

        Ford ford = new Ford("Shelby Cobra gt500",8);

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
