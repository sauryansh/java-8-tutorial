package _15terminaloperations;

import _00utility.StudentDatabase;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {
	public static long count(){
		return StudentDatabase.getAllStudentDetails()
			  .stream()
			  .filter(student -> student.getGpa()>=3.9)
			  .collect(counting());
	}
	
	public static void main(String[] args) {
		System.out.println("count: "+count());
	}
}
