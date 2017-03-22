package yt.javi.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {

    public  List<Object> getFizzBuzzSequence() {
        List<Object> buzzSequence = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 != 0) {
                    buzzSequence.add("Buzz");
                } else if (i % 5 != 0) {
                    buzzSequence.add("Fizz");
                } else {
                    buzzSequence.add("FizzBuzz");
                }
            } else {
                buzzSequence.add(i);
            }
        }

        return buzzSequence;
    }
}
