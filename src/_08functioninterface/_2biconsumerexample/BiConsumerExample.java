package _08functioninterface._2biconsumerexample;

import _00utility.Student;
import _00utility.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static BiConsumer<String, String> biConsumer = (a,b)-> System.out.println("First Name: "+a+" Last Name: "+b);
    static  BiConsumer<Integer,Integer> multiply = (a,b)-> System.out.println("Multiply: "+ (a*b));
    static BiConsumer<Integer,Integer> division = (a,b)-> System.out.println("Division: "+ (a/b));
    static BiConsumer<Integer,Integer> sumAndProduct = multiply.andThen(division);
    static BiConsumer<String,List<String>> biConsumerNnA = (name,activities)-> System.out.println("name : "+name + " and there activities : "+activities);




    public static void nameAndActivities(){
        List<Student> studentList = StudentDatabase.getAllStudentDetails();
        studentList.forEach(student -> biConsumerNnA.accept(student.getName(),student.getActivities()));
    }



    public static void main(String[] args) {
        biConsumer.accept("PRITAM", "SINGH");
        System.out.println("-----------------------------------------------");
        multiply.accept(10,32);
        System.out.println("-----------------------------------------------");
        division.accept(100,32);
        System.out.println("-----------------------------------------------");
        sumAndProduct.accept(200,10);
        System.out.println("-----------------------------------------------");
        nameAndActivities();
        System.out.println("-----------------------------------------------");

    }
}
