package Mummi;

public class Main {
    public static Place place;

    public static Mummi Father;
    public static Mummi Mother;
    public static Mummi Son;

    public static Action_Preformable[] actions = new Action_Preformable[10];

    public static void main(String[] args) {
        place_artInit();
        personInit();
        actionsInit();

        actions[1].preformAction(place);
        actions[0].preformAction(Father, Mother, Son);
        Father.say(place.toString());
    }

    public static void place_artInit(){
        Place[] subs = new Place[]{
                new Place("Roof", null, new Artifact("Sink")),
                new Place("Room", null, new Artifact("Half-circle"))};

        subs[0].addArtifact(new Artifact("Mask", Color.GOLDEN, Mood.MERRY));
        subs[0].addArtifact(new Artifact("Mask", Color.GOLDEN, Mood.SAD));
        subs[1].addArtifact(new Artifact("Curtain", Color.RED, Mood.SORROWFUL));
        subs[1].addArtifact(new Artifact("Absent wall", Color.NONE, Mood.NONE));
        subs[1].addArtifact(new Artifact("Web", Color.WHITE, Mood.NONE));

        place = new Place("Strange object", subs, new Artifact("House"));
    }

    public static void personInit(){
        Father = new Mummi("Father", 34, 'M');
        Father.moveTo(place.getSubLocations()[1]);
        Mother = new Mummi("Mother", 33, 'F');
        Mother.moveTo(place.getSubLocations()[1]);
        Son = new Mummi("Son", 12, 'M');
        Son.moveTo(place.getSubLocations()[1]);
    }

    public static void  actionsInit(){
        actions[0] = new Action_Preformable(){
            @Override
            public void preformAction(Object... args) {
                String res = args[0].toString()+" turns to: ";
                for (int i = 1; i<args.length;i++) {
                    res = res.concat(args[i].toString());
                    if (i!=args.length-1) res+="; ";
                };
                System.out.println(res);
            }
            @Override
            public String toString() {
                return "implements method turn to a given person";
            }
        };
        actions[1] = new Action_Preformable(){
            @Override
            public void preformAction(Object... args) {
                System.out.println(((Place)args[0]).getName() + ": floats");
            }

            @Override
            public String toString() {
                return "implements method float on the water";
            }
        };

    }
}