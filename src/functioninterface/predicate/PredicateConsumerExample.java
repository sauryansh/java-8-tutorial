package functioninterface.predicate;

import functioninterface.utility.Student;
import functioninterface.utility.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {
	Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
	Predicate<Student> p2 = student -> student.getGpa()>=3.9;
	BiConsumer<String, List<String>> studentBiConsumer = (name,activities)-> System.out.println("Name: "+  name + " ActivitiesList: "+activities);
	Consumer<Student> studentConsumer = (student -> {
		if(p1.and(p2).test(student)){
			studentBiConsumer.accept(student.getName(),student.getActivities());
		}
	});
	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		new PredicateConsumerExample().printNameAndActivities(studentList);
	}
	private void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}
}
