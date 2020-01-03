public class Car {
    private String name;
    private int numOfCylinders;
    private boolean haveEngine;
    private int numOfWheels;

    public Car(String name, int numOfCylinders) {
        this.haveEngine = true;
        this.numOfWheels = 4;
        this.name = name;
        this.numOfCylinders = numOfCylinders;
    }

    public String getName() {
        return name;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
