package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static  void main(String[] args) {
        // Lambdas with Generics
        Reverser<String> strReverser = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println(strReverser.reverse("Okay no really that's getting really cool!"));

        Reverser<List<Integer>> intReverser = (numbers) -> {
            List<Integer> reversedList = new ArrayList<>();

            for (int i = numbers.size() - 1; i >= 0 ; i--) {
                reversedList.add(numbers.get(i));
            }
            return reversedList;
        };


        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        System.out.println(intReverser.reverse(numberList));
    }
}
