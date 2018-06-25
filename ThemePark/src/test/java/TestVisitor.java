import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestVisitor {
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(18, 170, 100);
        visitor2 = new Visitor(21, 172, 80);
    }

    @Test
    public void testGetAge() {
        assertEquals(18, visitor1.getAge());
    }

    @Test
    public void testGetHeight() {
        assertEquals(172, visitor2.getHeight());
    }

    @Test
    public void testGetMoney() {
        assertEquals(80, visitor2.getMoney());
    }

    @Test
    public void testVisitedAttractionsCount() {
        assertEquals(0, visitor1.visitedAttractionsCount());
    }

    @Test
    public void testAddAttractionToVisitedAttractions() {

        visitor1.addAttractionToVisitedAttractions(new Rollercoaster("Big Dipper", 3));
        assertEquals(1, visitor1.visitedAttractionsCount());
    }
}
