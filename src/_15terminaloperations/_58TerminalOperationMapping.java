package _15terminaloperations;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class _58TerminalOperationMapping {
	public static void main(String[] args) {
		final List<String> listOfStudentName = getListOfStudentName();
		System.out.println("NameList: "+listOfStudentName);
		final Set<String> setOfStudentName = getSetOfStudentName();
		System.out.println("NameList: "+setOfStudentName);
	}

	private static Set<String> getSetOfStudentName() {
		return StudentDatabase.getAllStudentDetails()
                .stream()
				//.collect(mapping(Student::getName,toSet()));
				.map(Student::getName).collect(toSet());
	}

	private static List<String> getListOfStudentName() {
		final List<String> listOfStudentName = StudentDatabase.getAllStudentDetails()
				.stream()
				.collect(mapping(Student::getName, toList()));
		return listOfStudentName;
	}
}
