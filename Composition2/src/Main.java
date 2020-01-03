public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("King", 4, 4, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 80);

        Room room = new Room("Rakin's", wall1, wall2, wall3, wall4, bed, ceiling, lamp);

        room.makeBed();
        room.getLamp().turnOn();


    }
}
