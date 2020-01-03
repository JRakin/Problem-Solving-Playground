import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int testCase=Integer.parseInt(scan.nextLine());
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		while(testCase>0) {
			int id=scan.nextInt();
			String name=scan.next();
			double cgpa=scan.nextDouble();
			
			Student st=new Student(id,name,cgpa);
			
			studentList.add(st);
			
			testCase--;
		}
		scan.close();
		
		studentList.sort(Comparator.comparing(Student::getCgpa).reversed().
				thenComparing(Student::getName).thenComparing(Student::getId));
		
		for(Student st:studentList) {
			System.out.println(st.getName());
		}
	}
}
