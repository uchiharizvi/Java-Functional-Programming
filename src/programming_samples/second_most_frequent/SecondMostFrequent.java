package programming_samples.second_most_frequent;

import java.util.List;
import java.util.stream.Collectors;

public class SecondMostFrequent {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,2,10,11,9,5,4,2,3,2);
        System.out.println(countFrequency(numbers));
    }

    /**
     * /**
     * Explanation
     * -----------
     * 1. numbers.stream() - converts the numbers into a stream, which can be processed using functional operations
     * 2. collect() - terminal operation to process elements of a stream and produce result - collect into a map
     * 3. Collectors.groupingBy(num -> num) - groups the elements based on classifier function.
     *      example [1,2,2,3,3,3] will produce
     *          1-> [1,1]
     *          2-> [2,2]
     *          3->[3,3]
     * 4. Collectors.counting - downstream collector to count the number of elements in each group
     *      Calculates size of each list and store in resulting map
     *      example 1-> [1,1] = 1->1
     *              2-> [2,2] = 2->2
     *              3->[3,3] = 3->3
     * 5. Sorting (entrySet().stream().sorted) - Converts the map into a stream of
     *      entries and sorts them in descending order of frequency.
     * 6. toList - Collects to List (Java 16) - Converts the list back into a stream and
     *      skips the first entry (most frequent element).
     * 7. skip(1) - Converts the list back into a stream and skips the first entry (most frequent element).
     * 8. findFirst() - Retrieves the second most frequent element as an Optional.
     * 9. If an element is found, map it to the desired result string; otherwise, provide a fallback message.
     *
     **/
    private static String countFrequency(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .toList()
                .stream()
                .skip(1)
                .findFirst()
                .map(entry -> "Second Most Frequent Element: " + entry.getKey())
                .orElse("Not enough distinct elements to find the second most frequent.");
    }
}
