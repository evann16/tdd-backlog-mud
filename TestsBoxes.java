import org.junit.*;
import static org.junit.Assert.*;

public class TestsBoxes {
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }
/** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        Thing t3 = new Thing("truc3");
        b.add(t1);
        b.add(t2);
    }

    @Test
    public void testBoxContains(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        Thing t3 = new Thing("truc3");
        b.add(t1);
        b.add(t2);
        assertTrue(b.contains(t1));
        assertTrue(b.contains(t2));
        assertFalse(b.contains(t3));
    }

    @Test
    public void testBoxRemove(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        Thing t3 = new Thing("truc3");
        b.add(t1);
        b.add(t2);
        assertTrue(b.contains(t1));
        assertTrue(b.contains(t2));
        assertFalse(b.contains(t3));
        b.remove(t2);
        assertTrue(b.contains(t1));
        assertFalse(b.contains(t2));
        assertFalse(b.contains(t3));
    }
}