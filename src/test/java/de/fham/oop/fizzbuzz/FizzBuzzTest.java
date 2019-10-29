package de.fham.oop.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {


    FizzBuzzAlternative sut;

    // wird vor jedem test ausgeführt
    @BeforeEach
    void setUp() {

        sut = new FizzBuzzAlternative();
    }

    @Test
    void one_fizzbuzz_is_one() {

        // Set Up
        // FizzBuzz sut = new FizzBuzz();

        //run the function
        String resultOfFizzBuzz = sut.fizzBuzz(1);

        //assert resultOfFizzBuzz
        assertThat(resultOfFizzBuzz).isInstanceOf(String.class);
        assertThat(resultOfFizzBuzz).isEqualTo("1");
    }

    @Test
    void two_fizzBuzz_is_two() {

        // run the shit
        String result = sut.fizzBuzz(2);

        // assert the result
        assertThat(result).isEqualTo("2");
    }

    @Test
    void fizzBuzz_of_15_is_FizzBuzz() {

        String result = sut.fizzBuzz(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void fizzBuzz_of_3_is_Fizz() {

        String result = sut.fizzBuzz(3);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz_of_5_is_Buzz() {
        String result = sut.fizzBuzz(5);

        assertThat(result).isEqualTo("Buzz");
    }
}