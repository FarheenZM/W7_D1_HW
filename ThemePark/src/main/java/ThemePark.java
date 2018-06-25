import org.w3c.dom.Attr;

import java.util.ArrayList;

public class ThemePark {

//    private ArrayList<IReviewed> reviewed;
//
//    public ThemePark() {
//        this.reviewed = new ArrayList<IReviewed>();
//    }
//
//    public int countReviewed(){
//        return this.reviewed.size();
//    }
//
//    public void addReviewed(IReviewed reviewedItem) {
//
//        this.reviewed.add(reviewedItem);
//    }
//
//    public ArrayList<IReviewed> getAllReviewed(){
//        return reviewed;
//    }


    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviews() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(this.attractions);
        reviewed.addAll(this.stalls);
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addAttractionToVisitedAttractions(attraction);
    }

}
