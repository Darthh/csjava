package CoursesProject;

import java.util.ArrayList;

public class Course {
	
		// Data fields
		private String courseName;
		private ArrayList<String> students;
		private int getNumberOfStudents;
		
		// Constructor
		//public course create course
		public Course(String courseName) {
			this.courseName = courseName;
			students = new ArrayList<String>();
		}

		// Methods
		

		//getStudents
		public String[] getStudents() {
			String[] a = new String[students.size()];
			return students.toArray(a);
		}

		 //public int getnumberstudents
		public int getNumberOfStudents() {
			return students.size();
		}

		//getCourseName
		public String getCourseName() {
			return courseName;
		}

		//dropStudent
		public void dropStudent(String student) {
			students.remove(student);
		}
	
		
		 //addStudent
		public void addStudent(String student) {
			students.add(student);
		}

		
		
		
	}
	
	

