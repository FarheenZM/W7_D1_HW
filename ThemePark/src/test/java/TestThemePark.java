import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark();
    }

    @Test
    public void testCountReviewed() {
        assertEquals(0, themePark.countReviewed());
    }

    @Test
    public void testAddReviewed() {
        themePark.addReviewed(new Rollercoaster("Big Dipper", 3));
        themePark.addReviewed(new IceCreamStall("Icecream World", "Rita", "S001",4));
        assertEquals(2, themePark.countReviewed());
    }

    @Test
    public void testGetAllReviewed() {
        themePark.addReviewed(new Rollercoaster("Big Dipper", 3));
        int result = themePark.getAllReviewed().size();
        assertEquals(1, result);

    }

    //    ThemePark themepark;
//
//    Visitor visitor;
//
//    ArrayList<Attraction> attractions;
//    ArrayList<Stall> stalls;
//
//
//    @Before
//    public void setUp() throws Exception {
//        attractions = new ArrayList<Attraction>();
//        stalls = new ArrayList<Stall>();
//
//
//        attractions.add(new Rollercoaster("Big Dipper"));
//        attractions.add(new Playground("The Big Play"));
//        attractions.add(new Park("The Green Park"));
//
//        stalls.add(new IceCreamStall("Icecream World", "Rita", "S001"));
//        stalls.add(new CandyflossStall("The Candyfloss", "Tia", "S002"));
//        stalls.add(new TobaccoStall("To Tobacco","Jay", "S003"));
//
//        themepark = new ThemePark(attractions, stalls);
//
//    }
//
//    @Test
//    public void testGetAttractions() {
//        assertEquals(attractions, themepark.getAttractions());
//    }
//
//    @Test
//    public void testGetStalls() {
//        assertEquals(stalls, themepark.getStalls());
//    }
//
//    @Test
//    public void testSetAttractions() {
//        ArrayList<Attraction> testAttractions;
//        testAttractions = new ArrayList<Attraction>();
//        testAttractions.add(new Rollercoaster("Big Dipper"));
//
//        themepark.setAttractions(testAttractions);
//
//        assertEquals(testAttractions, themepark.getAttractions());
//    }
//
//    @Test
//    public void testSetStalls() {
//        ArrayList<Stall> testStalls;
//        testStalls = new ArrayList<Stall>();
//        testStalls.add(new CandyflossStall("The Candyfloss", "Tia", "S002"));
//
//        themepark.setStalls(testStalls);
//
//        assertEquals(testStalls, themepark.getStalls());
//
//    }


}
