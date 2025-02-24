public class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // Calls show() of Mother class

        Child ch = new Child();
        ch.show(); // Calls overridden show() of Child class

        Mother ref = new Child();
        ref.show(); // Calls overridden show() of Child due to dynamic method dispatch
    }
}
