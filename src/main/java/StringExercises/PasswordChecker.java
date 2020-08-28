package StringExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    static int numberOfcriterios = 0;

    public static String checkValidityOfPassword(String pwd) {
        boolean uppercase_validity = oneUppercase(pwd);

        boolean lowercase_validity = oneLowercase(pwd);

        boolean number_validity = oneNumber(pwd);

        boolean specialcharacter_validity = oneSpecialcharacter(pwd);
        boolean length_validity = Eightcharacters(pwd);
        boolean sequence_validity = Threecharacters(pwd);

        if (uppercase_validity) {
            System.out.println("At least one uppercase");
            numberOfcriterios++;
        }


        if (lowercase_validity) {
            System.out.println("At least one lowercase");
            numberOfcriterios++;
        }


        if (number_validity) {
            System.out.println("At least one number");
            numberOfcriterios++;
        }


        if (specialcharacter_validity) {
            System.out.println("At least one special character");
            numberOfcriterios++;
        }


        if (length_validity) {
            System.out.println("Password length is at least 8 characters long");
            numberOfcriterios++;
        }


        if (sequence_validity == false) {
            System.out.println("It does not contain 3 same or consecutive characters in a row");
            numberOfcriterios++;
        }


        StringBuilder messageOutput = new StringBuilder();

        if (length_validity && numberOfcriterios >= 3) {

            if (numberOfcriterios == 3 || numberOfcriterios == 4)
                messageOutput.append("Password OK");
            else if (numberOfcriterios == 5)
                messageOutput.append("Strong Password");
            else
                messageOutput.append("Very Strong Password");
        } else
            messageOutput.append("Invalid Password \n" + "Your password should meet the following requirements: \n 1. At least one uppercase character \n " +
                    "2. At least one lowercase character \n 3. At least one number \n 4. At least one special character (e.g., !, _ etc) \n  5. Must be at least 8 characters long" +
                    "\n6. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");

        return messageOutput.toString();
    }

    private static boolean Threecharacters(String pwd) {

        Pattern regexOneUppercase = Pattern.compile("(?i)(?:([a-z0-9])\\\\1{2,})*");

        Matcher m = regexOneUppercase.matcher(pwd);

        return m.find();
    }

    private static boolean Eightcharacters(String pwd) {

        Pattern regexOneUppercase = Pattern.compile(".{8,}");

        Matcher m = regexOneUppercase.matcher(pwd);

        return m.find();
    }

    private static boolean oneSpecialcharacter(String pwd) {

        Pattern regexOneUppercase = Pattern.compile("(?=.*[@#$%^&+=_!])");

        Matcher m = regexOneUppercase.matcher(pwd);

        return m.find();
    }

    private static boolean oneNumber(String pwd) {

        Pattern regexOneUppercase = Pattern.compile("(?=.*[0-9])");

        Matcher m = regexOneUppercase.matcher(pwd);

        return m.find();
    }

    private static boolean oneLowercase(String pass) {

        Pattern regexOneUppercase = Pattern.compile("(?=.*[a-z])");

        Matcher m = regexOneUppercase.matcher(pass);

        return m.find();
    }

    private static boolean oneUppercase(String pass) {

        Pattern regexOneUppercase = Pattern.compile("(?=.*[A-Z])");

        Matcher m = regexOneUppercase.matcher(pass);

        return m.find();
    }
}
