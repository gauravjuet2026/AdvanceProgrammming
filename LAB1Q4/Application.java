// public class Application {
//     public static void main(String[] args) {
//         Two obj = new Two(); // ERROR! No default constructor in One
//     }
// }
public class Application {
    public static void main(String[] args) {
        Two obj = new Two(10); // Now it works!
    }
}
