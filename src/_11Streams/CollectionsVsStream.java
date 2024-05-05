package _11Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");
        names.add("pritam");
        names.add("ratan");
        System.out.println("List Result Before: "+names);
        names.remove(0);
        System.out.println("List Result After: "+names);

        //Stream is not allowed to create, delete or modify
        //Stream are not allowed to traverse again and again

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        // nameStream.forEach(System.out::println);//Error: use only once.


    }
}
