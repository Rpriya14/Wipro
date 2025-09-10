package packages;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    public String getModelName() { return "Hero Splendor"; }
    public String getRegistrationNumber() { return "TN01AB1234"; }
    public String getOwnerName() { return "Ravi"; }
    public int getSpeed() { return 60; }
    public void radio() { System.out.println("Radio is ON"); }
}

class Honda extends Vehicle {
    public String getModelName() { return "Honda Shine"; }
    public String getRegistrationNumber() { return "TN02XY5678"; }
    public String getOwnerName() { return "Priya"; }
    public int getSpeed() { return 80; }
    public void cdplayer() { System.out.println("CD Player is running"); }
}

public class TestVehicle {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        System.out.println(h1.getModelName() + " owned by " + h1.getOwnerName());
        h1.radio();

        Honda h2 = new Honda();
        System.out.println(h2.getModelName() + " owned by " + h2.getOwnerName());
        h2.cdplayer();
    }
}