import java.util.Scanner;
public class Repeatquiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        System.out.println("What is " + number1 + " + " + number2 + "?" );
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == number1 + number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 + number2) + ".");
        }
        scanner.close();
    }
}
