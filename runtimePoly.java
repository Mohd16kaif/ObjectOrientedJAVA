class Animal {

    public void sound() {
        System.out.println("Sound of Animal...");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat : meows...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog : barks...");
    }
}

public class runtimePoly {
    public static void main(String[] args) {

        Animal a; // parents reference
        a = new Animal();
        a.sound();

        a = new Cat(); // cat object
        a.sound();
        a = new Dog(); // dog object
        a.sound();

    }
}
