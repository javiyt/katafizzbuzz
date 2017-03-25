package yt.javi.kata.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;


public class FizzBuzz {
  public List<Object> getFizzBuzzSequence() {
    return rangeClosed(1, 100)
            .mapToObj(String::valueOf)
            .map(isDivisibleBy("FizzBuzz", 3, 5))
            .map(isDivisibleBy("Buzz", 5))
            .map(isDivisibleBy("Fizz", 3))
            .map(value -> isInteger(value) ? parseInt(value) : value)
            .collect(toList());
  }

  private boolean isInteger(String value) {
    try {
      parseInt(value);
      return true;
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
  }

  private Function<String, String> isDivisibleBy(String ifMatch, Integer... divisor) {
    return value -> isInteger(value)
            && Arrays.stream(divisor).allMatch(integer -> Integer.valueOf(value) % integer == 0) ? ifMatch : value;
  }
}