package tutorial0;

/**
 * Created by victor on 01.08.16.
 */
public class EnterToClub {
    public static void main(String[] args){

        // this is the age of person who is going to club
        int age = 20;

        // enter to club is restricted from people younger that 18 years old
        int clubAgeRestriction = 18;

        // let's try to enter to the club
        if(age - clubAgeRestriction < 0){
            System.out.println("You are too young kid");
        }else{
            System.out.println("Welcome");
        }

    }
}
