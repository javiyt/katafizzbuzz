package yt.javi.kata.fizzbuzz;

import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;


public class FizzBuzz {
  public List<Object> getFizzBuzzSequence() {
    return rangeClosed(1, 100)
            .mapToObj(value -> isDivisibleBy5(value) && isDivisibleBy3(value) ? "FizzBuzz" : value)
            .map(value -> isDivisibleBy5(value) ? "Buzz" : value)
            .map(value -> isDivisibleBy3(value) ? "Fizz" : value)
            .collect(toList());
  }

  private boolean isInteger(String s) {
    try {
      parseInt(s);
      return true;
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
  }

  private boolean isDivisibleBy5(Object integer) {
    return isInteger(integer.toString()) && Integer.valueOf(integer.toString()) % 5 == 0;
  }

  private boolean isDivisibleBy3(Object integer) {
    return isInteger(integer.toString()) && Integer.valueOf(integer.toString()) % 3 == 0;
  }
}