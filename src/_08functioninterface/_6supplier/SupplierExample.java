package _08functioninterface._6supplier;

import _08functioninterface.utility.Student;
import _08functioninterface.utility.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()-> new Student("Adam",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"));
        Supplier<List<Student>> listSupplier = StudentDatabase::getAllStudentDetails;
        System.out.println(studentSupplier.get());
        System.out.println(listSupplier.get());
    }
}
