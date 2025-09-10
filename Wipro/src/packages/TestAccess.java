package packages;

class Foundation {
    private int var1 = 1;     // private
             int var2 = 2;     // default
    protected int var3 = 3;    // protected
    public int var4 = 4;       // public
}

public class TestAccess {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        // System.out.println(f.var1); // ❌ private – not accessible
        // System.out.println(f.var2); // ❌ default – not accessible (outside package)
        // System.out.println(f.var3); // ❌ protected – not accessible without inheritance
        System.out.println("Public variable: " + f.var4); // ✅ public accessible
    }
}