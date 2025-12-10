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

    public void remove(Thing t2) throws RuntimeException {
      boolean ok =  this.contents.remove(t2);
      if (!ok) throw new RuntimeException("Remove impossible");
    }

    private boolean open = false;
    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }
    public Boolean isOpen() {
        return open;
    }
    public String actionLook() {
        if (!open) {
            return "la boite est fermee";
        }
        ArrayList<String> liste = new ArrayList<>();
        for (Thing t : contents) {
            liste.add(t.name);
        }
        String listString = String.join(", ", liste);
        return "la boite contient: " + listString;
    }
}
