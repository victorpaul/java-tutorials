package tutorial.constructor;

public class Cat {

    private String name;
    private String type;
    private double age;

    public Cat() {
        name = "";
        type = "";
        age = 0;
    }

    public Cat(String catName, String catType, double catAge) {
        name = catName;
        type = catType;
        age = catAge;
    }

    public Cat(String catName, String catType) {
        name = catName;
        type = catType;
        age = 0;
    }
}