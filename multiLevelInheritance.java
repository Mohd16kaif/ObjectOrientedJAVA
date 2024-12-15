//parent most class
class Grandfather {
    static void property() {
        System.out.println("Property...");
    }
}

// parent/child class
class Father extends Grandfather {
    static void salary() {
        System.out.println("Monthly Salary...");
    }
}

// child class only
class Son extends Father {
    static void pocketMoney() {
        System.out.println("PocketMoney...");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {

        Grandfather.property();

        Father.property();
        Father.salary();

        Son.property();
        Son.salary();
        Son.pocketMoney();

    }
}
