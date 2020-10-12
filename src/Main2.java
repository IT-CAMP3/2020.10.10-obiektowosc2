public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        boolean result = a == b;

        System.out.println(result);

        Square s1 = new Square(5);
        Square s2 = new Square(5);

        result = s1 == s2;

        System.out.println(result);

        String string1 = "ABC";
        String string2 = new String("ABC");

        System.out.println(string1.equals(string2));

        System.out.println(s1.equals(s2));
    }
}
