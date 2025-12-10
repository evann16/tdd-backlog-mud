import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes {
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
    @Test(expected = RuntimeException.class)
    public void testBoxRemoveFails(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        b.add(t1);
        b.remove(t2);
    }
    @Test
    public void testBoxIsOpen(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        b.add(t1);
        b.add(t2);
        b.open();
        assertTrue(b.isOpen());
        b.close();
        assertFalse(b.isOpen());
    }
    @Test
    public void testBoxLook(){
        Box b = new Box();
        Thing t1 = new Thing("truc1");
        Thing t2 = new Thing("truc2");
        b.add(t1);
        b.add(t2);
        b.open();
        assertEquals("la boite contient: truc1, truc2", b.actionLook());
        b.close();
        assertEquals("la boite est fermee", b.actionLook());
    }
}