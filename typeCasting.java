public class typeCasting {
    public static void main(String[] args) {

        // typecasting : when you assign a value of one primitive
        // datatype into another type.

        // widening/implicit type casting
        int i = 9;
        double d = i;
        System.out.println("i : " + i);
        System.out.println("d : " + d);

        // narrowing/manual type casting

        double db = 9.99;
        int j = (int) db;
        System.out.println("j : " + j);
        System.out.println("db : " + db);

        // COMPILATION ERROR
        // char c = 'g';
        // String s = c;
        // System.out.println(c);
        // System.out.println(s);

    }
}
