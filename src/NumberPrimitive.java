/**
 * Created by victor on 01.08.16.
 */
public class NumberPrimitive {

    // this is the very first function
    public static void main(String[] args){
        double dolalrToUahOld = 3;
        double dolalrToUahNew = 2;
        int totalPercentage = 100;
        double currentUahDifference = dolalrToUahOld-dolalrToUahNew;
        double currentPercentageDifference = currentUahDifference/dolalrToUahOld*totalPercentage;

        System.out.println("Current percentage difference is: " + currentPercentageDifference);

    }
}