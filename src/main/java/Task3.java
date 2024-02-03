import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] strNum = new String[]{"1, 2, 0", "4, 5"};

        String[] result = Arrays.stream(strNum)
                .flatMap(p -> Arrays.stream(p.split(", ")))
                .map(Integer::valueOf)
                .sorted(Comparator.comparingInt(i -> i))
                .map(String::valueOf)
                .toArray(String[]::new);

        System.out.println(String.join(", ", result));
    }
}
