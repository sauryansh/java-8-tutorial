package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.stream.Collectors;

public class _56TerminalOperationExampleJoining {
	public static String joining_1(){
		return StudentDatabase.getAllStudentDetails()
			  .stream()
			  .map(Student::getName)
			  .collect(Collectors.joining());
	}
	public static String joining_2(){
		return StudentDatabase.getAllStudentDetails()
			  .stream()
			  .map(Student::getName)
			  .collect(Collectors.joining("-"));
	}
	public static String joining_3(){
		return StudentDatabase.getAllStudentDetails()
			  .stream()
			  .map(Student::getName)
			  .collect(Collectors.joining("-","(",") "));
	}
	
	
	public static void main(String[] args) {
		System.out.println("Joining 1: "+ joining_1());
		System.out.println("Joining 2: "+ joining_2());
		System.out.println("Joining 2: "+ joining_3());
	}
}
