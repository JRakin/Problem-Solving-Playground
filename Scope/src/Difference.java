import java.util.Arrays;

public class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int [] arr){
		this.elements = arr;
	}
	
	public void computeDifference() {
		
		Arrays.sort(elements);
		
		maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
	
	}

}
