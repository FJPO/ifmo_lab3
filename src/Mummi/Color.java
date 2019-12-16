package Mummi;

//used in Artifact
public enum Color {
    RED("Red"),
    GOLDEN("Golden"),
    WHITE("White"),
    NONE("");
    private String  name;
    private Color(String line){this.name = line;}


    @Override
    public String toString() {
        return " "+this.name;
    }
}

