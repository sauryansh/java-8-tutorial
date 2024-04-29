package impvsde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> iList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
        /**
         * Imperative approach:
         */

        List<Integer> uniList = new ArrayList<>();
        for(Integer i: iList){
            if(!uniList.contains(i)){
                uniList.add(i);
            }
        }
        System.out.println("Result Imperative Style: "+ uniList);

        /**
         * Declarative Style:
         */

        List<Integer> uniqueList2 = iList.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        System.out.println("Result Declarative: "+uniqueList2);
    }

}
