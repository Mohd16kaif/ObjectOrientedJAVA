public class encapsulation {

    // instance variables
    private String name;
    private int age;

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        encapsulation en = new encapsulation();

        en.setName("xyz");
        en.setAge(12);

        System.out.println("Name : " + en.getName());
        System.out.println("Age : " + en.getAge());

    }
}
