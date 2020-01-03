public class Dog {
	String name;
	
	public Dog(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		Dog dog1=new Dog("Bart");
		dog1.bark();
		dog1.name="Fred";
		dog1.bark();
		
		Dog[] myDogs=new Dog[3];
		myDogs[0]=new Dog("tom");
		myDogs[1]=new Dog("Jerry");
		myDogs[2]=new Dog("Black");
		
		System.out.println("Last dog name is:");
		System.out.println(myDogs[2].name);
		
		int x=0;
		while(x<myDogs.length) {
			myDogs[x].bark();
			x++;
		}

	}
	public void bark() {
		System.out.println(name+" Says Ruff!");
	}
	public void eat() {
		System.out.println("Eat");
	}
}
