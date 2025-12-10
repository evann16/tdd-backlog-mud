import java.util.ArrayList;
class Thing{
    String name;
    public Thing(String name){
        this.name = name;
    }
}

class Box{
    ArrayList<Thing> contents = new ArrayList<>();
    public void add(Thing truc){
        this.contents.add(truc);
    }
    public boolean contains(Thing t1) {
       return this.contents.contains(t1);
    }
    public void remove(Thing t2) {
       this.contents.remove(t2);
    }
}
