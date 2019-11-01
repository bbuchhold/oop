package de.fham.oop.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzAlternative {

    public String fizzBuzz(int number) {

        Map<Integer,String> rulez = new HashMap<>();

        rulez.put(3, "Fizz");
        rulez.put(5, "Buzz");

        StringBuilder sb = new StringBuilder();

        rulez.forEach((integer, s) -> {
            if(number % integer == 0)
                sb.append(s);
        });

        return sb.length() > 0 ?
                            sb.toString() :
                            Integer.toString(number);
    }
}
