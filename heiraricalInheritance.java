class parent {
    static void fun() {
        System.out.println("Parent...");
    }
}

class son extends parent {
    static void son() {
        System.out.println("Son...");
    }
}

class daughter extends parent {
    static void daughter() {
        System.out.println("Daughter...");
    }
}

public class heiraricalInheritance {
    public static void main(String[] args) {

        parent.fun();
        son.son();
        son.fun();
        daughter.daughter();
        daughter.fun();
    }
}
