import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorities {
	
	public  List<Student> getStudents(List<String> events){
		PriorityQueue<Student> stu_queue=new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
		List<Student> students=new ArrayList<>();
		
		for(String e:events) {
			Scanner scan=new Scanner(e);
			String str=scan.next();
			
			if(str.equals("ENTER")) {
				String name=scan.next();
				double cgpa=scan.nextDouble();
				int id=scan.nextInt();
				
				Student student=new Student(id,name,cgpa);
				stu_queue.add(student);
			}
			else if(str.equals("SERVED")) {
				stu_queue.poll();
			}
			scan.close();
		}
		Student student1=stu_queue.poll();
		if(student1==null) {
			return students;
		}
		else {
			while(student1!=null) {
				students.add(student1);
				student1=stu_queue.poll();
			}
			return students;
		}
	}

}
