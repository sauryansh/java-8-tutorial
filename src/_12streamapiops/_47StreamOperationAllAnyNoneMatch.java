package _12streamapiops;

import _00utility.StudentDatabase;

public class _47StreamOperationAllAnyNoneMatch {
    public static Boolean allMatch(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static Boolean anyMatch(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }
    public static Boolean noneMatch(){
        return StudentDatabase.getAllStudentDetails()
                .stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }
    public static void main(String[] args) {
        System.out.println("result of all match: "+ allMatch());
        System.out.println("result of any match: "+ anyMatch());
        System.out.println("result of none match: "+ noneMatch());
    }

    //Take Predicate as an input and returns a Boolean as an output.
    //anyMatch() -> return true, if anyone of the element matches the predicate, otherwise false.
    //allMatch() -> return true, if all the elements match the predicate, otherwise false.
    //noneMatch() -> Just opposite to allMatch().


}
