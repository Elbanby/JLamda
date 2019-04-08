package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        /*
           Lets create a Score board:
           A score board in data structure can be conceptualized as a map
           where the name is the key, the score is the value and must be
           sorted in descending order
        */
        List<Person> people = new ArrayList<>();
        people.add(new Person(0000L, "John", 1000L));
        people.add(new Person(0001L, "Sam", 10L));
        people.add(new Person(0002L, "Liam", 20000L));

        Map<String, Long> scoreBoard = people
                .stream()
                .collect(Collectors.toMap(Person::getName, Person::getScore));

        scoreBoard
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(p -> {
                    System.out.println(p.getKey() + " -->> " + p.getValue());
                });
    }
}
