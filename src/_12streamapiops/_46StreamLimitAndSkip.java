package _12streamapiops;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _46StreamLimitAndSkip {
    public static Optional<Integer> limit(List<Integer> in){
        return in.stream()//6,7,8,9,10
                .limit(3)//6,7,8
                .reduce(Integer::sum);
    }



    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(6,7,8,9,10);
        System.out.println("Sum of limit(3): "+ (limit(in).isPresent()?limit(in).get(): " Element Length is small or empty for limit"));
        System.out.println("Sum of skip(3): "+ (skip(in).isPresent()?skip(in).get(): " Element Length is small or empty for skip"));
    }

    private static Optional<Integer> skip(List<Integer> in) {
        return in.stream()
                .skip(3)
                //.reduce((x,y)->(x+y));
                .reduce(Integer::sum);
    }
}
