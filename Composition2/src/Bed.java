public class Bed {
    private String style;
    private int height;
    private int pillow;
    private int sheets;
    private int quilt;

    public Bed(String style, int height, int pillow, int sheets, int quilt) {
        this.style = style;
        this.height = height;
        this.pillow = pillow;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed -> making");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getPillow() {
        return pillow;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
