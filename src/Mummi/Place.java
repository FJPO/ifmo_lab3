package Mummi;

public class Place implements Artifact_Ownable {
    private String name;
    private Place[] subLocations;
    private Artifact reminds;
    private Artifact[] artifacts = new Artifact[10];

    public Place(String name, Place[] subs, Artifact reminds){this.name = name; subLocations = subs; this.reminds = reminds;}
    public Place(String name){this.name = name;subLocations = null; this.reminds = null;}

    public String getName() {
        return name;
    }

    public Artifact getReminds() {
        return reminds;
    }

    public Place[] getSubLocations() {return subLocations;}
    @Override
    public Artifact[] getArtifacts() {return artifacts;}
    @Override
    public void addArtifact(Artifact a) {
        for (int i = 0; i < artifacts.length; i++){if(artifacts[i]==null) {artifacts[i]=a; break;} }
    }
    @Override
    public void removeArtifact(Artifact a){
        for (int i = 0; i < artifacts.length; i++){if(artifacts[i]==a) artifacts[i]=null;}
    }

    @Override
    public boolean equals(Object obj) {
        Place a = (Place) obj;
        return (this.name==a.name&&this.reminds==a.reminds);
    }

    @Override
    public String toString() {
        String artD = "";
        for (int i = 0; i < artifacts.length; i++){
            if (artifacts[i]==null) continue;
            if(artD!="") artD += ", ";
            artD += artifacts[i];
        }

        String subD = "";
        if (subLocations!=null){
            for (int i=0; i < subLocations.length; i++){
                subD += subLocations[i];
                if (i!=subLocations.length-1) subD+=";";
            }
        }
        return this.name + ((reminds==null)?"":(" in a form of a " + this.reminds)) +
                ((artD!="")?(" with"  + artD):"")+"."+((subD!="")?(" It consists of "+subD):"");
    }

    @Override
    public int hashCode() {
        int res = 17;
        int s = 37;
        res = s*res + name.hashCode();
        for (Place i: subLocations) res = s*res + i.hashCode();
        res = s*res + reminds.hashCode();
        return res;
    }

}
