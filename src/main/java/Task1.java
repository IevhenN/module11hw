import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Ievhen", "Maria", "Olga", "Petro", "Vasiliy");

        AtomicInteger count = new AtomicInteger(1);

        String[] result = names.stream()
                .map(s -> count.getAndIncrement() + " " + s)
                .filter(s -> Integer.parseInt(s.split(" ")[0]) % 2 == 1)
                .map(s -> s.split(" ")[0] + ". " + s.split(" ")[1])
                .toArray(String[]::new);


        System.out.println(String.join(", ", result));
    }
}
