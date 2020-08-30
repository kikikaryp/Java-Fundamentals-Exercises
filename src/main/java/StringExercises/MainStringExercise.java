package StringExercises;

import ArraysAndCollections.IStack;
import ArraysAndCollections.Lists;
import ArraysAndCollections.Stack;
import SimpleAlgorithms.SimpleAlgorithms;
import StringExercises.PasswordChecker;
import sun.java2d.pipe.SpanShapeRenderer;


import java.math.BigInteger;
import java.util.*;

import static SimpleAlgorithms.SimpleAlgorithms.*;

public class MainStringExercise {

    public static void main(String[] args) {

        //String class exercises
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("Let's create a password, waiting for input...");
        String pwd = scanner.nextLine();
        System.out.println(PasswordChecker.checkValidityOfPassword(pwd));
    }


}



