package CoursesProject;

public class CourseClient {

	public static void main(String[] args) {
		
		Course course1 = new Course("APCS but cooler");
		Course course2 = new Course("APCS");
		Course course3 = new Course("APCS but not cooler");
		
		//course 1 students = 3 -----------------
		course1.addStudent("Patrick");
		course1.addStudent("Adrain");
		course1.addStudent("Ben");
		course1.addStudent("Jackson");
		course1.addStudent("Ryan");
	
		
		//course 2 students = 4 -------------------
		course2.addStudent("Leo");
		course2.addStudent("Kelani");
		course2.addStudent("Daniel");
		course2.addStudent("Jack");
		course2.addStudent("Faith");
		//removes leo
		course2.dropStudent("Leo");
		
		//course 3 students = 5
		course3.addStudent("Bob");
		course3.addStudent("Mr.Gracias");
	
		
		//course1 number of students
		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		System.out.println("--------------");
		
		 //course1 get students and print i
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		
			
		
		
		
		//course2 number of students
		System.out.println();
		System.out.println("Number of students in course2: "
			+ course2.getNumberOfStudents());
		System.out.println("--------------");
		
		

		//course2 get students and print i
		String[] students1 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students1[i] + ", ");
		System.out.println();
		
		
		
		
		
		
		//course 3 number of students
		System.out.println();
		System.out.println("Number of students in course2: "
			+ course3.getNumberOfStudents());
		System.out.println("--------------");
		
		
		//course 3 get students and print i
		String[] students2 = course3.getStudents();
		for (int i = 0; i < course3.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
		System.out.println();
		
				
		
		
		
		
		
		
				
	}
}







