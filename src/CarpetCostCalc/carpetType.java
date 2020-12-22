package CarpetCostCalc;

import java.util.HashMap;

public class carpetType {

    String type;
    HashMap<String, Double> carpetMap = new HashMap<>();

    /**
     *
     * @param types
     */
    public  carpetType(String types) {
        this.type = types;
        carpetMap.put("velvet", 8.15);
        carpetMap.put("saxony", 10.5);
        carpetMap.put("frieze", 18.25);
        carpetMap.put("shag", 7.00);
    }

    /**
     *
     * @return cost based on type
     */
    public double cost(){
        return  carpetMap.get(type);
    }

}
