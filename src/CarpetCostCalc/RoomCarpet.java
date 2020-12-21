package CarpetCostCalc;

public class RoomCarpet {

    double cost;
    double length;
    double width;

    //Constructor
    public RoomCarpet(double len, double wider, double price){
        this.cost = price;
        this.length = len;
        this.width = wider;
    }

    public double totalCost(){
        RoomDimension obj = new RoomDimension();
        double area = obj.area(length, width);
        return area * cost;
    }

}
