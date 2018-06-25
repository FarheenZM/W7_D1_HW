import java.util.ArrayList;

public class Visitor {
    private int age;
    private int height;
    private int money;
    private ArrayList<IReviewed> visitedAttractions;

    public Visitor(int age, int height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<IReviewed>();
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<IReviewed> getVisited() {
        return visitedAttractions;
    }

    public int visitedAttractionsCount(){
        return visitedAttractions.size();
    }

    public void addAttractionToVisitedAttractions(IReviewed reviewed){

        visitedAttractions.add(reviewed);
    }
}
