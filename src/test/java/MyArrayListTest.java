

import org.example.Element;
import org.example.MyArrayList;
import org.example.Sorter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest {
    private MyArrayList<Element> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void testAddAndGet() {
        Element element = new Element("test");
        list.add(element);
        assertEquals("test", list.get(0).getValue());
    }

    @Test
    public void testSize() {
        list.add(new Element("test1"));
        list.add(new Element("test2"));
        assertEquals(2, list.size());
    }

    @Test
    public void testRemove() {
        list.add(new Element("test1"));
        list.add(new Element("test2"));
        list.remove(0);
        assertEquals("test2", list.get(0).getValue());
    }

    @Test
    public void testClear() {
        list.add(new Element("test1"));
        list.add(new Element("test2"));
        list.clear();
        assertEquals(0, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        list.remove(0);
    }

    @Test
    public void testSort() {
        list.add(new Element("b"));
        list.add(new Element("a"));
        list.add(new Element("c"));
        Sorter.quickSort(list);
        assertEquals("a", list.get(0).getValue());
        assertEquals("b", list.get(1).getValue());
        assertEquals("c", list.get(2).getValue());
    }
}
