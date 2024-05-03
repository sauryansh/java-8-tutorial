package _08functioninterface._3predicate;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
//Predicate and consumer example
public class _18PredicateConsumerExample {
	//Step2.1: Create instance of Predicate for GradeLevel
	Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
	//Step2.2: Create instance of Predicate for GPA Level
	Predicate<Student> p2 = student -> student.getGpa()>=3.9;
	//Step3: Print the data for name and there activities
	BiConsumer<String, List<String>> studentBiConsumer = (name,activities)-> System.out.println("Name: "+  name + " ActivitiesList: "+activities);
	//Step2: Accept the student, it will perform filtering operation.
	Consumer<Student> studentConsumer = (student -> {
		if(p1.and(p2).test(student)){ //Consuming message.
			studentBiConsumer.accept(student.getName(),student.getActivities());
		}
	});
	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudentDetails();
		new _18PredicateConsumerExample().printNameAndActivities(studentList);
	}

	//Step1: Creating instance method,
	// till now we were creating static method to see the behavior though it behaves always same.
	private void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);//Only accept Consumer.
	}
}
