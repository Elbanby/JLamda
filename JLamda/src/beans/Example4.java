package beans;

import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        // Passing Method references
        List<String> userCart = Arrays.asList("Scarf", "Gloves", "Shirt");

        userCart
                .stream()
                .forEach(System.out::println);



        // Only allow even numbers
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numberList
                .stream()
                .filter(e -> e % 2 == 0 )
                .forEach(Example4::customPrint);

    }

    public static void customPrint(int num) {
        System.out.println("Number in your list: " + num);
    }
}
