import org.junit.Before;

public class TestRollercoaster {

    Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Zigzag", 3);
    }
}
