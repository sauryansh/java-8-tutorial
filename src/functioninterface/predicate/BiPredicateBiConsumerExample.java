package functioninterface.predicate;

import functioninterface.utility.Student;
import functioninterface.utility.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateBiConsumerExample {
	Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
	Predicate<Student> p2 = student -> student.getGpa()>=3.9;
	
	BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3 &&gpa>=3.9;
	BiConsumer<String, List<String>> studentBiConsumer = (name,activities)-> System.out.println("Name: "+  name + " ActivitiesList: "+activities);
	Consumer<Student> studentConsumer = (student -> {
		if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
			studentBiConsumer.accept(student.getName(),student.getActivities());
		}
	});
	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		new BiPredicateBiConsumerExample().printNameAndActivities(studentList);
	}
	private void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}
}
