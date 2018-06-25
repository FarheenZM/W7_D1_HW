import org.junit.Before;

public class TestPlayground {

    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Play Park", 4);
    }
}
