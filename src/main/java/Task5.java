import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Ievhen", "Boris", "Olga", "Galina", "Roman");
        Stream<String> second = Stream.of("Nesterenko", "Petrenko", "Onishchenko");

        Stream<String> result = zip(first, second);

        result.peek(System.out::println).collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorA.next());
            resultList.add(iteratorB.next());
        }

        return resultList.stream();
    }
}
