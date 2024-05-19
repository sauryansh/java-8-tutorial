package _17optional;

import java.util.Optional;

public class _75OptionalIfPresentIsPresentExample {
    public static void main(String[] args) {
        //isPresent()
        Optional<String> optional = Optional.ofNullable("Hello Optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent())
            System.out.println(optional.get());
        //ifPresent()
        optional.ifPresentOrElse(System.out::println,()-> System.out.println("Empty"));
    }
}
