package CarpetCostCalc;

public class RoomDimension {

    double roomLength;
    double roomWidth;
   public RoomDimension(double width, double length){
        this.roomWidth = width;
        this.roomLength = length;
    }
    public double area()
    {
        return roomLength * roomWidth;
    }
}
