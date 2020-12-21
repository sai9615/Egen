package CarpetCostCalc;

public class RoomCarpet extends RoomDimension {

    double cost;

    //Constructor
    public RoomCarpet(double length, double width, double price){
        super(length, width);
        this.cost = price;
    }

    public double totalCost(){
        double area = this.area();
        return area * cost;
    }

}
