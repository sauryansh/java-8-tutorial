package _08functioninterface._3predicate;

import _08functioninterface.utility.Student;
import _08functioninterface.utility.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample2 {
	public static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
	public static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
	
	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		studentList.forEach((student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentByGpa() {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		studentList.forEach((student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudents() {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		studentList.forEach((student -> {
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void main(String[] args) {
		//StudentDatabase
		//filterStudentByGradeLevel();
		//System.out.println("-----------------------------------------------------------------------------------------------------------");
		//filterStudentByGpa();
		//System.out.println("-----------------------------------------------------------------------------------------------------------");
		filterStudents();
	}
}
