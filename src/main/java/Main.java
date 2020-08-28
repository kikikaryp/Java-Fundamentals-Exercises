import ArraysAndCollections.IStack;
import ArraysAndCollections.Lists;
import ArraysAndCollections.Stack;
import SimpleAlgorithms.SimpleAlgorithms;
import StringExercises.PasswordChecker;
import sun.java2d.pipe.SpanShapeRenderer;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import static SimpleAlgorithms.SimpleAlgorithms.*;

public class Main {

    public static void main(String[] args) {

        //Exercises on simple algorithms
//        //Exercise 1
        System.out.println("Please enter a number smaller or equal to 20");
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());
//
        System.out.println("The factorial of " + number + " is: " + factorialN(number));
//
        System.out.println("Please enter whatever number you want");
        int number2 = Integer.parseInt(scanner.nextLine());
        BigInteger factorial_result = bigFactorial(number2);
        System.out.println("The factorial of " + number2 + " is: " + factorial_result);
//        //if we want larger numbers we can use the BinInteger function
////
////
////        //Exercise 2
        System.out.println("This is the maximum value of the integer you can input in order for the output to be valid \n" + MaxValueOfN());
////
//
//        //Exercise 3
        System.out.println("Please enter a number to check if it is prime");
        int number3 = Integer.parseInt(scanner.nextLine());
//
        System.out.println(isPrime(number3));
//
        //Exercise 4
        System.out.println("Please enter a number to calculate the following sum 1 + 1/2 + 1/3 + ... + 1/n");
        double number4 = Double.parseDouble(scanner.nextLine());

        System.out.println(sumN(number4));
//
//        //Exercise 5
        System.out.println("Please enter a number in order to print the number of its digits");
        long number5 = Long.parseLong(scanner.nextLine());
        System.out.println("This number has " + digitCounter(number5) + " digits");
//
//        //Exercise 6
        float decimal_part = 0;
        System.out.println("Give a positive float number");
        float number6 = Float.parseFloat(scanner.nextLine());
        int y = (int) number6;

        if (number6 > 1) {
            decimal_part = (number6 % y);
            if (decimal_part != 0) {
                //we count how many were the decimals in the given number
                //so we can format the decimal part by the same way
                int count_decimals = String.valueOf(number6).split("\\.")[1].length();
                System.out.println("The decimal part is: " + String.format("%." + count_decimals + "f", decimal_part));
            } else System.out.println("There is no decimal part in this number");
        } else System.out.println(number6);

        //Exercises on arrays, collections
        //Exercise 1

        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(2, 3, 5, 17, 20, 50));
        ArrayList<Integer> prime_list = Lists.prime_sublist(listA);
        System.out.println(prime_list.toString());

        //Exercise 2
        ArrayList<Integer> duplicatesList = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30, 5, 10, 15, 50));
        ArrayList<Integer> noDuplicatesList = new ArrayList<>(new HashSet<>(duplicatesList));
        System.out.println(noDuplicatesList.toString());

        //Exercise 3
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(Lists.digitsInDescending(num));

        //Exercise 4

        IStack<Integer> stack = new Stack<Integer>(4);
        stack.push(1);
        stack.push(2);

        stack.pop();

        stack.push(3);

        System.out.println("Top element is " + stack.peek());

        //Exercise 5
        String line = scanner.nextLine();

        char[] ch = line.toCharArray();
        Stack<Character> word = new Stack<>(ch.length);

        for (int i = 0; i < ch.length; i++) {
            word.push(ch[i]);
        }

        int i = 0;
        while (!word.isEmpty()) {
            ch[i++] = word.pop();
        }

        System.out.println(String.copyValueOf(ch));

        //Exercise 6
        System.out.println("Write a word to check if it is symmetric");
        String word2 = scanner.nextLine();

        int lenOfword = word2.length();
        System.out.println(lenOfword);
        int mid = lenOfword / 2;


        int start1 = 0;
        int start2 = lenOfword - 1;
        int flag = 0;

        while (start1 < mid && start2 >= mid) {
            if (word2.toLowerCase().charAt(start1) == word2.toLowerCase().charAt(start2)) {
                start1++;
                start2--;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("The entered string is symmetrical");
        } else {
            System.out.println("The entered word is not symmetric");
        }


        //String class exercises

        //Exercise 1
        System.out.println("Let's create a password, waiting for input...");
        String pwd = scanner.nextLine();
        System.out.println(PasswordChecker.checkValidityOfPassword(pwd));
    }


}



