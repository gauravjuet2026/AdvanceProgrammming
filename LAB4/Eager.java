public class Eager {
    private static Eager uniqueInstance = new Eager();
    private static int counter = 0;

    // Private constructor to prevent instantiation from other classes
    private Eager() {
        counter++; 
        System.out.println("Eager Constructor Called. Instance count: " + counter);
    }

    // Public method to provide access to the instance
    public static Eager getInstance() {
        return uniqueInstance;
    }

    // Public method to get the instance count
    public static int getInstanceCount() {
        return counter; 
    }
}