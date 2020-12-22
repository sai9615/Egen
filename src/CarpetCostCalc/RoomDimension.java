package CarpetCostCalc;

public class RoomDimension {

    double roomLength;
    double roomWidth;

    /**
     *
     * @param width
     * @param length
     */
    public RoomDimension(double width, double length){
        this.roomWidth = width;
        this.roomLength = length;
    }

    /**
     *
     * @return area of the carpet
     */
    public double area()
    {
        return roomLength * roomWidth;
    }
}
