public class Voidmethods {
    public static void main(String[] args) {
        greetUser();
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("mul:" + mulltiplyNumbers(4, 5));
    }

    public static void greetUser() {
        System.out.println("Hello, User!");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int mulltiplyNumbers(int a, int b) {
        return a * b;
    }
}
