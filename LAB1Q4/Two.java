// public class Two extends One {
//     // No constructor is explicitly defined here
// }
public class Two extends One {
    Two(int y) {
        super(y); // Calling parent class constructor
        System.out.println("Constructor of Two: " + y);
    }
}
