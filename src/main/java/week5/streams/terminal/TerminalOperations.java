package week5.streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Veli", "Ahmet", "Mehmet", "Ali", "Veli");

        System.out.println(names);

        List<String> nameList = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(nameList);

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNames);

        names.stream()
                .collect(Collectors.toList());

        Map<String, Integer> nameLengths = uniqueNames.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(nameLengths);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Integer result = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Toplam" + result);

        Integer reduce = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(reduce);

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);

        System.out.println("max: ö" + max.get() + " - min: " + min.get());

        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();

        System.out.println(count);


        List<Integer> numberList = List.of(10, 20, 30, 40, 50);

        boolean allEven = numberList.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        boolean anyGreaterThan25 = numberList.stream().anyMatch(n -> n > 25);

        System.out.println(anyGreaterThan25);

        boolean noneNegative = numberList.stream().noneMatch(n -> n < 0);
        System.out.println(noneNegative);


    }
}
