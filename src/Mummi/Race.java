package Mummi;

public enum Race {
    MUMMI("Mummi"),
    HUMAN("Human");
    protected String name;
    Race(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
