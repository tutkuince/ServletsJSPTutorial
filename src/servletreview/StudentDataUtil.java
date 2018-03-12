package servletreview;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		// create an empty list
		List<Student> studentList = new ArrayList<>();
			
		// add sample data
		studentList.add(new Student("Tutku", "Ince", "incetutku@gmail.com"));
		studentList.add(new Student("Ugur", "Batikan", "batikanugur@gmail.com"));
		studentList.add(new Student("Emin", "Koklu", "kokluemin@gmail.com"));
		studentList.add(new Student("Alper", "Omeroglu", "omeroglualper@gmail.com"));
		studentList.add(new Student("Musa", "Atlihan", "atlihanmusa@gmail.com"));
		
		// return the list
		return studentList;
	}
}
