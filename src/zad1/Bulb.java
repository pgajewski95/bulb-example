package zad1;

public class Bulb {

    String brand; //company name
    int vitality; //hours
    int power; //watt
    public static int bulbCounter;

    private Bulb(String brand, int vitality, int power) {
        this.brand = brand;
        this.vitality = vitality;
        this.power = power;
    }

    public Bulb() {
    }

    public String description() {
        return "This "  + this.brand.toUpperCase() + " bulb has: " + this.power + " watt power and " + this.vitality + " hours vitality!";
    }

    public Bulb bustPower() {
        return new Bulb(this.brand, this.vitality, this.power * 2);
    }

    public Bulb create(String brand, int vitality, int power) throws Exception {
        if (vitality <= 0 || power <= 0) {
            throw new Exception("This " + brand.toUpperCase() + " bulb have too low power or vitality!");
        } else {
            bulbCounter++;
            return new Bulb(brand, vitality, power);
        }
    }

}
