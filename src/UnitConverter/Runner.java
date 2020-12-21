package UnitConverter;

public class Runner {
    public static void main(String[] args) {
        FeetToCentimeter obj = new FeetToCentimeter();
        System.out.println(obj.converter(15));
        System.out.println(obj.converter(10.999));
    }
}
