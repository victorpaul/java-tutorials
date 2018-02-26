package tutorial0;

/**
 * Created by victor on 01.08.16.
 */
public class Validator {
    public static void main(String[] args) {

        String firstName = "Va";
        String lastName = "Va";

        String errorMessage = "";

        boolean isValidation = true;

        if (firstName.length() < 2 || firstName.trim().isEmpty() == true) {
            isValidation = false;
            errorMessage = errorMessage + " Firstname is invalid";
        }

        if (lastName.length() < 2 || lastName.length() == 0) {
            isValidation = false;
            errorMessage = errorMessage + " Lastname is invalid";
        }

        if (isValidation) {
            System.out.println("Success");
        } else {
            System.out.println("There are some errors: " + errorMessage);
        }

        //String firstName.isEmpty();
        //String firstName.trim();

    }
}