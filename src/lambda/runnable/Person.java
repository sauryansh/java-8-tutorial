package lambda.runnable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private int age;
    private double salary;

    //Custom comparator
    public static Comparator<Person> ageComparator = (o1, o2) -> {
        if(o1.getAge()<o2.getAge()){
            return -1;
        }else if(o1.getAge()>o2.getAge()){
            return 1;
        }else{
            return 0;
        }
    };
}
