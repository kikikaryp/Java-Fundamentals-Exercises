package SimpleAlgorithms;

import java.math.BigInteger;
import java.util.Scanner;

import static SimpleAlgorithms.SimpleAlgorithms.*;

public class MainSimpleAlgorithms {

    public static void main(String[] args) {

        //Exercises on simple algorithms

        while (true) {

            //print the menu with the possible options
            menu();

            Scanner scanner = new Scanner(System.in);
            int pressedOption = Integer.parseInt(scanner.nextLine());

            switch (pressedOption) {

                case 1: {
                    //Exercise 1
                    System.out.println("Please enter a number smaller or equal to 20");
                    long number = Long.parseLong(scanner.nextLine());

                    System.out.println("The factorial of " + number + " is: " + factorialN(number));

                    //if we want larger numbers we can use the BinInteger function
                    System.out.println("Please enter whatever number you want, even more than 20");
                    int number2 = Integer.parseInt(scanner.nextLine());
                    BigInteger factorial_result = bigFactorial(number2);
                    System.out.println("The factorial of " + number2 + " is: " + factorial_result);

                    break;

                }

                case 2: {
                    // Exercise 2
                    System.out.println("This is the maximum value of the integer you can input in order for the output to be valid \n" + MaxValueOfN());
                    break;
                }

                case 3: {
                    //Exercise 3
                    System.out.println("Please enter a number to check if it is prime");
                    int number3 = Integer.parseInt(scanner.nextLine());
                    System.out.println(isPrime(number3));
                    break;

                }

                case 4: {
                    //Exercise 4
                    System.out.println("Please enter a number to calculate the following sum 1 + 1/2 + 1/3 + ... + 1/n");
                    double number4 = Double.parseDouble(scanner.nextLine());
                    System.out.println(sumN(number4));
                    break;

                }

                case 5: {
                    //Exercise 5
                    System.out.println("Please enter a number in order to print the number of its digits");
                    long number5 = Long.parseLong(scanner.nextLine());
                    System.out.println("This number has " + digitCounter(number5) + " digits");
                    break;
                }

                case 6: {
                    //Exercise 6
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

                    break;
                }

                case 7:{

                    System.exit(0);
                }

                default:
                    System.out.println("You didn't press one of the possible options. \n Try again...");
            }
        }

    }

    static void menu()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Press the corresponding number depending on the desired option (for example: 1). \n");
        sb.append("1. Factorial calculation of a given number. \n");
        sb.append("2. Check what is the maximum value of an int. \n");
        sb.append("3. Check if a given number is a prime or not. \n");
        sb.append("4. Calculate the sum of harmonic series depending on the given number. \n");
        sb.append("5. Count the digits of a number of type long. \n");
        sb.append("6. Print the decimal part of a given float number. \n");
        sb.append("7. Quit the menu");

        System.out.println(sb);


    }
}
