package ArraysAndCollections;

import java.util.*;

public class MainArraysAndCollections {


    public static void main(String[] args) {

        //Exercises on arrays, collections

        while (true) {

            //print the menu with the possible options
            menu();

            Scanner scanner = new Scanner(System.in);
            int pressedOption = Integer.parseInt(scanner.nextLine());

            switch (pressedOption) {

                case 1: {

                    //Exercise 1
                    List<Integer> listA = new ArrayList<>(Arrays.asList(2, 3, 5, 17, 20, 50));
                    List<Integer> prime_list = Lists.prime_sublist(listA);
                    System.out.println("The primes are: " + prime_list.toString());
                    break;

                }

                case 2: {

                    //Exercise 2
                    ArrayList<Integer> duplicatesList = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30, 5, 10, 15, 50));
                    ArrayList<Integer> noDuplicatesList = new ArrayList<>(new HashSet<>(duplicatesList));
                    System.out.println(noDuplicatesList.toString());
                    break;
                }

                case 3: {

                    //Exercise 3
                    System.out.println("Enter a number: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    System.out.println(Lists.digitsInDescending(num));
                    break;

                }

                case 4: {

                    //Exercise 4
                    IStack<Integer> stack = new Stack<Integer>(4);
                    stack.push(1);
                    stack.push(2);

                    stack.pop();

                    stack.push(3);

                    System.out.println("Top element is " + stack.peek());

                    break;

                }

                case 5: {

                    //Exercise 5
                    System.out.println("Enter a word: ");
                    String line = scanner.nextLine();

                    char[] ch = line.toCharArray();
                    IStack<Character> word = new Stack<>(ch.length);

                    for (int i = 0; i < ch.length; i++) {
                        word.push(ch[i]);
                    }

                    int i = 0;
                    while (!word.isEmpty()) {
                        ch[i++] = word.pop();
                    }

                    System.out.println(String.copyValueOf(ch));
                    break;
                }

                case 6: {

                    ///Exercise 6
                    System.out.println("Enter a word: ");
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


                    break;
                }

                case 7: {

                    System.exit(0);
                }

                default:
                    System.out.println("You didn't press one of the possible options. \n Try again...");
            }
        }

    }


    static void menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Press the corresponding number depending on the desired option (for example: 1). \n");
        sb.append("1. Return a sublist that contains only prime numbers. \n");
        sb.append("2. Eliminate duplicates from a list. \n");
        sb.append("3. Return the digits of a number in descending order. \n");
        sb.append("4. Execute my own version of Stack. \n");
        sb.append("5. Reverse a string using only a stack. \n");
        sb.append("6. Check if a word is symmetric. \n");
        sb.append("7. Quit the menu");

        System.out.println(sb);


    }
}
