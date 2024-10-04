package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SomeServiceTest {
    private SomeService someService;
    @BeforeEach
    void setUp () {
        someService = new SomeService();
    }
   // 3.1.
   @ParameterizedTest
   @ValueSource (ints = {3, 6, 9, 33})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource (ints = {5, 10, 20, 55})
    void multipleFiveNotThreeReturnBuzz (int n) {
        assertEquals("Buzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource (ints = {15, 225, 3375})
    void multipleFiveNotThreeReturnFizzBuzz (int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource (ints = {1, 2, 41, 43})
    void multipleFiveNotThreeReturnNumber (int n) {
        assertEquals(Integer.toString(n), someService.fizzBuzz(n));
    }

}