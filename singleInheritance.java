//parent class 
class Animal {
    static void eat() {
        System.out.println("Eating...");
    }
}

// child class
class Cat extends Animal {
    static void meow() {
        System.out.println("Meow...");
    }
}

public class singleInheritance {
    public static void main(String[] args) {

        Cat.eat(); // child (cat) calling parents method
        Cat.meow(); // child (cat) calling its own method
        Animal.eat(); // Parent (Animal) calling its own class
    }
}
