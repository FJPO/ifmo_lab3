package Mummi;

public class Artifact{
        private String name;
        private Color color = null;
        private Mood emotion = null;

        public Artifact(String name, Color color, Mood emotion){
                this.name = name; this.color = color; this.emotion = emotion;
        }
        public Artifact(String name){this.name = name;}

        public String getName() {return name;}
        public Color getColor() {return color;}
        public Mood getEmotion() {return emotion;}

        //setters
        public void setColor(Color color) {
                this.color = color;
        }
        public void setEmotion(Mood emotion) {
                this.emotion = emotion;
        }

        @Override
        public String toString() {
                return ((color!=null)?color.toString():"")+((emotion!=null)?emotion.toString():"")+" "+name;
        }
        @Override
        public boolean equals(Object obj) {
                Artifact a = (Artifact)obj;
                return (this.name==a.name && this.emotion==a.emotion && this.color==a.color);
        }
        @Override
        public int hashCode() {
                int res = 17;
                int s = 37;
                res = s*res + name.hashCode();
                res = s*res + ((color==null)?0:color.hashCode());
                res = s*res +((emotion==null)?0:emotion.hashCode());
                return res;
        }
}
