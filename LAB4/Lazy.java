public class Lazy {
    private static Lazy uniqueInstance; 
    private static int counter = 0; 

    // Private constructor to prevent instantiation from other classes
    private Lazy() {
        counter++; 
        System.out.println("Lazy Constructor Called. Instance count: " + counter);
    }

    // Public method to provide access to the instance (Lazy Initialization)
    public static Lazy getInstance() {
        if (uniqueInstance == null) { 
            uniqueInstance = new Lazy();
        }
        return uniqueInstance;
    }

    // Public method to get the instance count
    public static int getInstanceCount() {
        return counter; 
    }
}
