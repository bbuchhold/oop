package de.fham.oop.fizzbuzz;

public class FizzBuzz {

    public String calcFizzBuzz(int number) {

        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        // Umwandlung von int auf string
        return Integer.toString(number);
    }
}
