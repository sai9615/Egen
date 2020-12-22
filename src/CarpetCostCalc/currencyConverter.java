package CarpetCostCalc;

import java.util.HashMap;

public class currencyConverter {

    String currencyType;
    HashMap<String, Double> currencyMap = new HashMap<>();

    /**
     *
     * @param types
     */
    public currencyConverter(String types){
        this.currencyType = types;
        currencyMap.put("usd", 1.00);
        currencyMap.put("inr", 70.00);
        currencyMap.put("euro", 0.82);
        currencyMap.put("pound", 0.75);
    }

    /**
     *
     * @param price
     * @return price in particular denomination
     */
    public double converter(double price){
        return price * currencyMap.get(currencyType);
    }

}
