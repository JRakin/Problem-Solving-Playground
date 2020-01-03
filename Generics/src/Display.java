
public class Display<T> {
	public <E> void printArray(E[] elements){
		for(E element:elements) {
			System.out.println(element);
		}
	}
}
