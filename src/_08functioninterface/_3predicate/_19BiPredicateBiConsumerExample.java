package _08functioninterface._3predicate;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class _19BiPredicateBiConsumerExample {
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println("Name: " + name + " ActivitiesList: " + activities);
    Consumer<Student> studentConsumer = (student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudentDetails();
        new _19BiPredicateBiConsumerExample().printNameAndActivities(studentList);
    }

    private void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }
}
