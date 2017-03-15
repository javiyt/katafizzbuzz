package yt.javi.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() throws Exception {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void itGeneratesASequenceOfNumbersFrom1To100() {
    List<Object> fizzBuzzList = fizzBuzz.getFizzBuzzSequence();

    assertThat(fizzBuzzList.get(0), is(1));
    assertThat(fizzBuzzList.get(fizzBuzzList.size() - 1), is(100));
  }

  @Test
  public void itGeneratesASequenceOfNumberWithFizzInsteadOfNumbersDivisibleBy3() {
    List<Object> fizzBuzzList = fizzBuzz.getFizzBuzzSequence();

    assertThat(fizzBuzzList.get(2), is("Fizz"));
    assertThat(fizzBuzzList.get(5), is("Fizz"));
    assertThat(fizzBuzzList.get(98), is("Fizz"));
  }

  @Test
  public void itGeneratesASequenceOfNumberWithBuzzInsteadOfNumbersDivisibleBy5() {
    List<Object> fizzBuzzList = fizzBuzz.getFizzBuzzSequence();

    assertThat(fizzBuzzList.get(4), is("Buzz"));
    assertThat(fizzBuzzList.get(9), is("Buzz"));
    assertThat(fizzBuzzList.get(99), is("Buzz"));
  }

  @Test
  public void itGeneratesASequenceOfNumberWithFizzBuzzInsteadOfNumbersWhenDisivibleBy3And5() {
    List<Object> fizzBuzzList = fizzBuzz.getFizzBuzzSequence();

    assertThat(fizzBuzzList.get(14), is("FizzBuzz"));
    assertThat(fizzBuzzList.get(29), is("FizzBuzz"));
    assertThat(fizzBuzzList.get(59), is("FizzBuzz"));
  }
}