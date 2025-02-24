import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("вишня", "яблоко", "дыня", "виноград", "вишня");
        System.out.println(DuplicateChecker.hasDuplicates(words));
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(DuplicateChecker.hasDuplicates(numbers));
    }

    /*public static double add(double a, double b) {
        return a + b;
    } */

    public static List<Person> removeDuplicate(List<Person>... lists) {
        List<Person> result = new ArrayList<>();
        Set<Person> set = new HashSet<>();
        for (List<Person> list : lists) {
            set.addAll(list);
        }
        return new ArrayList<>(set);
    }
}