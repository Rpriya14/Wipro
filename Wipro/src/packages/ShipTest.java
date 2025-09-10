package packages;

class Compartment {
    int height, width, breadth;

    Compartment(int h, int w, int b) {
        height = h;
        width = w;
        breadth = b;
    }

    void display() {
        System.out.println("Dimensions: " + height + " x " + width + " x " + breadth);
    }
}

public class ShipTest {
    public static void main(String[] args) {
        Compartment c = new Compartment(10, 20, 30);
        c.display();
    }
}
