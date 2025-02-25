public class EagerTest {
    public static void main(String[] args) {
        
        // Getting instances of Eager
        Eager e1 = Eager.getInstance();
        Eager e2 = Eager.getInstance();
        Eager e3 = Eager.getInstance();

        // Displaying the constructor call count (which should be 1, as it’s a singleton)
        System.out.println("Final Constructor Call Count: " + Eager.getInstanceCount());
    }
}
