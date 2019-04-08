package beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        // Streams examples

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // map mutate the data
        numbers = numbers
                         .stream()
                         .map(n -> n * 2)
                         .collect(Collectors.toList());

        System.out.println(numbers);


        // Filter blocks certain data from passing (Only allow divisible by 3s)
        numbers = numbers
                        .stream()
                        .filter(n -> n % 3 == 0)
                        .collect(Collectors.toList());

        System.out.println(numbers);


        // Reduce, literally reduces the result to a single value. 
        int sum = numbers
                    .stream()
                    .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println(sum);
    }
}
