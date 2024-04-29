package lambda.runnable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, 50000));
        people.add(new Person("Bob", 25, 60000));
        people.add(new Person("Charlie", 35, 45000));

        // Sorting the list based on age using custom comparator
        Collections.sort(people, Person.ageComparator);

        // Printing the sorted list
        System.out.println("People sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}