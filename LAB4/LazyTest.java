public class LazyTest {
    public static void main(String[] args) {
        System.out.println("Before calling getInstance()");

        // Getting instances of Lazy
        Lazy l1 = Lazy.getInstance();
        Lazy l2 = Lazy.getInstance();
        Lazy l3 = Lazy.getInstance();

        // Displaying the constructor call count
        System.out.println("Final Constructor Call Count: " + Lazy.getInstanceCount());
    }
}
