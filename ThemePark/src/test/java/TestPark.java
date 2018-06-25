import org.junit.Before;

public class TestPark {
    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Green Zone", 3);
    }
}
