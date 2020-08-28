package ArraysAndCollections;

import SimpleAlgorithms.SimpleAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lists {

    public static ArrayList<Integer> prime_sublist(ArrayList<Integer> list) {

        ArrayList<Integer> primelist = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);

            if (SimpleAlgorithms.checkPrime(number))
                primelist.add(number);

        }

        return primelist;
    }

    public static String digitsInDescending(int number) {

        int len = Integer.toString(number).length();
        Integer[] digits = new Integer[len];
        int i = 0;

        while (number != 0) {
            digits[i] = number % 10;
            number /= 10;
            i++;
        }


        Arrays.sort(digits, Collections.reverseOrder());
        return String.join(" ", Arrays.toString(digits).replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
    }


}
