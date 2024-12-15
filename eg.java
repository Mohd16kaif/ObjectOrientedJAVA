public class eg {
    static int staticNumber = 10;

    // Static initialization block
    static {
        staticNumber = 100;
    }

    public static void main(String[] args) {
        System.out.println(eg.staticNumber); // Output: 100
    }
}
