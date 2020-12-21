package CarpetCostCalc;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("please enter the room length, width and cost per square feet");
        Scanner scn = new Scanner(System.in);
        double length = scn.nextDouble();
        double width = scn.nextDouble();
        double price = scn.nextDouble();
        RoomCarpet obj = new RoomCarpet(length, width, price);
        System.out.println("Total cost =" + obj.totalCost());
    }
}
