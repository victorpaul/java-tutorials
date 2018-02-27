package tutorial.builder;

public class Main {

    public static void main(String[] args) {

        ComputerBuilder cb = new ComputerBuilder();

        cb
                .setCpu("intel")
                .setRam("2x16gb");

        cb
                .setMotherboard("z370 asrock")
                .setSSD("intel optain");

        ComputerEntity ce = cb.build();


    }

}