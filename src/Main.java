import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("вишня","яблоко","дыня","виноград","вишня");
        System.out.println(DuplicateChecker.hasDuplicates(words));
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(DuplicateChecker.hasDuplicates(numbers));
    }

}