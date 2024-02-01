
import org.example.Element;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElementTest {
    private Element element;

    @Before
    public void setUp() {
        element = new Element("test");
    }

    @Test
    public void testGetValue() {
        assertEquals("test", element.getValue());
    }

    @Test
    public void testSetValue() {
        element.setValue("newTest");
        assertEquals("newTest", element.getValue());
    }

    @Test
    public void testToString() {
        assertEquals("test", element.toString());
    }
}
