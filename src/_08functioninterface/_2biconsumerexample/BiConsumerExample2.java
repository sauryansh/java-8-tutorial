package _08functioninterface._2biconsumerexample;

import java.util.*;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        // Example 1: Iterating over a map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        BiConsumer<String, Integer> printEntry = (key, value) -> System.out.println("Key: " + key + ", Value: " + value);

        // Using BiConsumer to iterate over the map
        map.forEach(printEntry);

        // Example 2: Processing data in batches
        String[] data = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        BiConsumer<String, String> processBatch = (first, second) -> System.out.println("Processing batch: " + first + ", " + second);

        // Process data in batches of two
        for (int i = 0; i < data.length; i += 2) {
            String first = data[i];
            String second = (i + 1 < data.length) ? data[i + 1] : null;
            processBatch.accept(first, second);
        }

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        List<Integer> resultList = new ArrayList<>();

        // Define a BiConsumer to calculate the sum of corresponding elements from both lists
        BiConsumer<Integer, Integer> sumConsumer = (x, y) -> resultList.add(x + y);

        // Iterate over both lists and apply the BiConsumer
        for (int i = 0; i < list1.size(); i++) {
            sumConsumer.accept(list1.get(i), list2.get(i));
        }

        // Print the result list
        System.out.println("Result List: " + resultList);
    }
}
