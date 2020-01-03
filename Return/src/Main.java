
public class Main {

	public static void main(String[] args) {
		double newScore=calculatePoint("tim",5);
		System.out.println("New score is" +newScore);
		//calculatePoint(75);
		//calculatePoint();
		calFeetAndInchesTocentimeters(6,0);

	}
	public static double calculatePoint(String playerName,int a) {
		System.out.println("Player" +playerName+ "scored" +a+ "points");
		return a*1000;
	}
	public static double calFeetAndInchesTocentimeters(double feet,double inches) {
		if((feet<0)|| (inches<0 && inches>12)) {
			return -1;
		}
		double centimeter=(feet*12)*2.54;
		centimeter +=inches*2.54;
		System.out.println(feet+"feet "+inches+" inches= "+centimeter);
		return centimeter;
		
	}

}
