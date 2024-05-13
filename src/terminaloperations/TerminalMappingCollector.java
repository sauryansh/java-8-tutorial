package terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class TerminalMappingCollector {
	public static void main(String[] args) {
		//mapping() collector applies a transformation first and then collect the data in a collection
		List<String> namesList = StudentDatabase.getAllStudentDetails()
			  .stream()
			  .collect(mapping(Student::getName, toList()));
		/*		List<String> namesList = StudentDatabase.getAllStudentDetails()
			  .stream()
			  .collect(mapping(Student::getName, toList()));*/
		System.out.println("namesList: "+namesList);
	}
}
