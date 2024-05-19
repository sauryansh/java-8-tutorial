package _17optional;

import java.util.Optional;

public class _73OptionalEmptyOfNullableOfExample {
    public static void main(String[] args) {
        ofNullable().ifPresentOrElse(System.out::println,() -> System.out.println("not present in ofNullable"));
        of().ifPresentOrElse(System.out::println,() -> System.out.println("not present in of"));
        System.out.println(empty());
    }
    static Optional<String> ofNullable(){
        return Optional.ofNullable(null);
    }

    static Optional<String> of(){
        return Optional.of("Hello Of Method");
    }

    static Optional<String> empty(){
        return Optional.empty();
    }
}
