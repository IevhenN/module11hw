package task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        LinearCongruentAlgorithm r = new LinearCongruentAlgorithm(25214903917L, 11L, (long) Math.pow(2, 48));
        Stream<Long> stream =
                Stream.iterate(9L, (seed) -> r.setSeed((Long) seed).next());

        List<Long> result = stream
                .limit(20)
                .collect(Collectors.toList());

        System.out.println("result = " + result);
    }
}
