package Mummi;

public class Mummi extends Human_being {
    public Mummi(String name, int age, char sex) {
        super(name, age, Race.MUMMI, sex);
    }

    @Override
    public String describe() {
        return "a short creature with white skin, common habitation is a self-titled cartoon";
    }
}
