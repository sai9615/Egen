package CarpetCostCalc;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("please enter the room length, width \n");
        Scanner scn = new Scanner(System.in);
        double length = scn.nextDouble();
        double width = scn.nextDouble();
        double price = 0.00;

        /**
         *Get the cost based on the type of the carpet
         */
        System.out.println("Enter the type of carpet 1.Velvet 2.Saxony 3.Frieze 4.Shag" );
        try {
            String st = scn.next();
            carpetType cpt = new carpetType(st.toLowerCase());
            price = cpt.cost();
        } catch (NullPointerException e){
            System.out.println("Please enter the correct carpet type");
        }

        /**
         * Get the currency type
         */
        System.out.println("Please enter the currency type 1.USD (Default) 2.INR 3.POUNDS 4.EUROS");
        try {
            String denomination = scn.next();
            currencyConverter cC = new currencyConverter(denomination.toLowerCase());
            price = cC.converter(price);
        } catch (NullPointerException e){
            System.out.println("Please enter the correct currency type");
        }

        /**
         * Display the total cost
         */
        RoomCarpet obj = new RoomCarpet(length, width, price);
        System.out.println("Total cost = "+obj.totalCost());
    }
}
