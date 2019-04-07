package beans;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static  void main(String[] args) {
        // Block Lambda expressions
        Concater concater = (strings) -> {
            return strings
                    .stream()
                    .reduce("", (str, currStr) -> str + " " + currStr);
        };

        List<String> userAddress = Arrays.asList("1400", "Trafalgar RD", "Oakville", "ON");
        System.out.println(concater.concat(userAddress));
    }
}
