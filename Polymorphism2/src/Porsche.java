public class Porsche extends Car {

    public Porsche(String name, int numOfCylinders) {
        super(name, numOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}
