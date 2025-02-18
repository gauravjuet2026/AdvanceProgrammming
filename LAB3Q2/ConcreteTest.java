public class ConcreteTest extends AbsTest {
    public void display() {
        System.out.println("Display method from ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest test = new ConcreteTest();
        test.display();
    }
}
