package packages;

abstract class Vehicle1 {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Logan extends Vehicle {
    public String getModelName() { return "Logan Car"; }
    public String getRegistrationNumber() { return "KA05LM7890"; }
    public String getOwnerName() { return "Arun"; }
    public int speed() { return 100; }
    public void gps() { System.out.println("GPS Activated"); }
}

class Ford extends Vehicle {
    public String getModelName() { return "Ford Car"; }
    public String getRegistrationNumber() { return "KA06PQ2468"; }
    public String getOwnerName() { return "Meena"; }
    public int speed() { return 120; }
    public void tempControl() { System.out.println("Temperature Control ON"); }
}

public class TestFourWheeler {
    public static void main(String[] args) {
        Logan l = new Logan();
        System.out.println(l.getModelName() + " owned by " + l.getOwnerName());
        l.gps();

        Ford f = new Ford();
        System.out.println(f.getModelName() + " owned by " + f.getOwnerName());
        f.tempControl();
    }
}