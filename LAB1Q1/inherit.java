class Mother {
    int x = 10; 
    void show() {
        System.out.println("This is show() of Mother. Value of x: " + x);
    }
}


class Child extends Mother {
   
}

class inherit {
    public static void main(String[] args) {
        // Creating an object of the Mother class
        Mother m = new Mother();
        m.show(); 

        // Creating an object of the Child class
        Child ch = new Child();
        ch.show();
    }
}