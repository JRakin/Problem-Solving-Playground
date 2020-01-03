public class Main {
    static {
        System.out.println("Invoked before main");// static block invoke before the main method
    }
    void demo(){
        System.out.println("Current class method");
    }
    void test(){
        this.demo();
    }

    public static void main(String[] args) {
        try{
            Class cls = Class.forName("Test");
            Test obj = (Test)cls.newInstance();
            obj.message();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
