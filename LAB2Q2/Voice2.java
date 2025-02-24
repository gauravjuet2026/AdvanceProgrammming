// Voice2.java
class Voice2 {
    private Animal[] animals = new Animal[5]; // Array of 5 Animal objects

    // Step 1: Prepare the voices
    private void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Step 2: Call makeVoice() for all animals
    private void hear() {
        for (Animal a : animals) {
            a.makeVoice(); // Calls overridden method in respective subclass
        }
    }

    // **Template Method** - Ensures the correct order
    public void templateMethod() {
        prepareVoice(); // Step 1
        hear();         // Step 2
    }
}
