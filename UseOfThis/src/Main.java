public class Main {
    int age;
    int height;

    Main(int age, int height){
        this.age = age;
        this.height = height;
    }
    void method1(Main obj){
        System.out.println("Method 1 is invoked");
        System.out.println("Age: "+obj.age+" Height: "+obj.height);
    }
    void method2(){
        method1(this);
    }

    public static void main(String[] args) {
        Main m = new Main(10,1);
        m.method2();
    }
}
