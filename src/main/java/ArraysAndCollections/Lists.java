package ArraysAndCollections;

import SimpleAlgorithms.SimpleAlgorithms;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    public static List<Integer> prime_sublist(List<Integer> list) {

        List<Integer> primes = list
                .stream()
                .filter(w -> SimpleAlgorithms.checkPrime(w))
                .collect(Collectors.toList());

        return primes;
    }

    public static String digitsInDescending(int number) {

        int len = Integer.toString(number).length();
        List<Integer> digits = new ArrayList<>();
        int i = 0;

        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
            i++;
        }


        Arrays.sort(digits.toArray(), Collections.reverseOrder());

        String result = digits.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        return result;
    }


}
