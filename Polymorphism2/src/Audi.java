public class Audi extends Car {

    public Audi(String name, int numOfCylinders) {
        super(name, numOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}
