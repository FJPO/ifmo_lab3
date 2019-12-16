package Mummi;

//depicts a sentient creature
public abstract class Human_being implements Sayable, Artifact_Ownable {

    private final String name;
    private final int age;
    private final Race race;
    private final char sex;

    private Place location = null;
    private Mood mood = null;
    private Artifact[] artifact = new Artifact[1];

    public Human_being(String name, int age, Race race, char sex){
        this.name = name;
        this.age = age;
        this.race = race;
        this.sex = sex;
    }


    String getName(){return this.name;}
    int getAge(){return this.age;}
    Race getRace(){return this.race;}
    char getSex(){return this.sex;}

    public void moveTo(Place p) {
        this.location = p;
    }
    public Place currentLocation() { return this.location; }

    public void setEmotion(Mood m) {
        this.mood = m;
    }
    public Mood getEmotion() {
        return this.mood;
    }

    @Override
    public Artifact[] getArtifacts() {return this.artifact;}

    @Override
    public void addArtifact(Artifact a) {this.artifact[0] = a;}

    @Override
    public void removeArtifact(Artifact a) {if (this.artifact[0]==a) this.artifact = null;}

    @Override
    public void say(String s) {
        System.out.println(this.name+" says: " + s);
    }

    public abstract String describe();
    @Override
    public String toString() {
        return race+" "+name+" of "+age+" years,  "+((sex=='M')?"male":"female");
    }
    @Override
    public boolean equals(Object obj) {
        Human_being a = (Human_being) obj;
        return (this.name==a.name&&this.sex==a.sex&&this.age==a.age&&this.race==this.race);
    }

    @Override
    public int hashCode() {
        int res = 17;
        int s = 37;
        res = s*res + name.hashCode();
        res = s*res + age;
        res = s*res + race.hashCode();
        res = s*res + (int)sex;
        return res;
    }
}
