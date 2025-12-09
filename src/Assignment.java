//Group5
public class Assignment extends SchoolItem {

    //Number of points the assignment is worth
    private double points;
    //Weight of the assignment in the gradebook
    private int weight;
//Constructor: initializes the assignment with its name, points, and weight 
    public Assignment(String name, double points, int weight) {
        super(name);
        this.points = points;
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        System.out.println("Assignment: " + name +
                " | Points: " + points +
                " | Weight: " + weight);
    }

    public double getPoints() { return points; }
    public int getWeight() { return weight; }
}
