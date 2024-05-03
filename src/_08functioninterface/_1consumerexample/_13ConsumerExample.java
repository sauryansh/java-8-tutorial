package _08functioninterface._1consumerexample;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class _13ConsumerExample {
    static Consumer<String> c1 = (name)-> System.out.println(name.toUpperCase());
    static Consumer<Student> c2 = (student)-> System.out.println(student);
    static Consumer<Student> c3 = (student -> System.out.print(student.getName()+" <-- plays -->"));
    static Consumer<Student> c4 = (student -> System.out.println(student.getActivities()));
    public static void printName(){
        //Consumer<Student> c2 = (student)-> System.out.println(student);
        final List<Student> allStudentDetails = StudentDatabase.getAllStudentDetails();
        //Print all student details
        allStudentDetails.forEach(c2);
    }

    public static void printNameAndThereActivities(){
/*        Consumer<Student> c3 = (student -> {
            //System.out.println("Student Name: "+student.getName() + " and there activties: "+ student.getActivities());
            System.out.print(student.getName()+" <-- plays -->");
        });*/

/*        Consumer<Student> c4 = (student -> {
            //System.out.println("Student Name: "+student.getName() + " and there activties: "+ student.getActivities());
            System.out.println(student.getActivities());
        });*/
        final List<Student> allStudentDetails = StudentDatabase.getAllStudentDetails();
        allStudentDetails.forEach(c3.andThen(c4)); //Consumer chaining
    }

    public static void gradeLevelGreaterThan3(){
        final List<Student> allStudentDetails = StudentDatabase.getAllStudentDetails();
        allStudentDetails.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        } );
    }
    public static void main(String[] args) {

        c1.accept("pritam");

        // printName();
        System.out.println("----------------------------------------------------- -");
        printNameAndThereActivities();
        System.out.println("----------------------------------------------------- -");
        gradeLevelGreaterThan3();
    }
}
