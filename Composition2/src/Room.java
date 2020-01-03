public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed bed;
    private Ceiling ceiling;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Ceiling ceiling, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> making bed");
        bed.make();
    }
}
