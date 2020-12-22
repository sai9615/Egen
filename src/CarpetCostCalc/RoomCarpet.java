package CarpetCostCalc;

public class RoomCarpet extends RoomDimension {

    double cost;

    /**
     *
     * @param length
     * @param width
     * @param price
     */
    public RoomCarpet(double length, double width, double price){
        super(length, width);
        this.cost = price;
    }

    /**
     *
     * @return total cost
     */
    public double totalCost(){
        double area = this.area();
        return area * cost;
    }

}
