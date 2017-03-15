package yt.javi.kata.fizzbuzz;

public class Kata {
  public static void main() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.getFizzBuzzSequence().forEach(System.out::println);
  }
}
