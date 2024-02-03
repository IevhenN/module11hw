import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Ievhen", "ievhen", "Maria", "Olga", "Petro", "Vasiliy");

        List<String> result = names
                .stream()
                .sorted(Comparator.comparing(object -> object.toString().toLowerCase()).reversed())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("result = " + result);
    }
}
