import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Generate a random list
        List<Integer> randomList = UtilityFunctions.generateRandomList(10);
        System.out.println("Random List: " + randomList);

        // Count occurrences
        Map<Integer, Integer> occurrences = UtilityFunctions.countOccurrences(randomList);
        System.out.println("Occurrences: " + occurrences);

        // Sort the list
        UtilityFunctions.sortList(randomList);
        System.out.println("Sorted List: " + randomList);
    }
}
