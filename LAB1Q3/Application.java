public class Application {
    public static void main(String args[]) {
        Mother m1 = new Child(); // Upcasting (Parent reference holding Child object)
        m1.show(); // Calls overridden method in Child due to dynamic method dispatch
    }
}
