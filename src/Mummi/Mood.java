package Mummi;

//used in artifact and Human_being
public enum Mood {
    MERRY("Merry"),
    SAD("Sad"),
    SORROWFUL("Sorrowful"),
    NONE("");

    private String name;
    Mood(String line){this.name = line;}


    @Override
    public String toString() {
        return (name.equals(""))?"":(" "+this.name);
    }
}
