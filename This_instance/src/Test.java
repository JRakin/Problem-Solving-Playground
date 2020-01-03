
public class Test {
	int a;
	int b;
	
	public Test() {
		a=10;
		b=20;
	}
	Test get() {
		
		return this;
	}
	
	public void display(){
		System.out.println("A= "+a+" B= " +b);
	}
	public void sum() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Test test=new Test();
		test.get().sum();
		test.get().display();
	}

}
