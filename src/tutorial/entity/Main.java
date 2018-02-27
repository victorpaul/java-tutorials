package tutorial.entity;

public class Main {
    public static void main(String[] args) {

        UserEntity loggedInUser = new UserEntity(1,"Vasia","vas@vas.com","qwerty");

        System.out.println(loggedInUser.id);

    }
}
