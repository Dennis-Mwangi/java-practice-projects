public class Testvoidmethod {
    
    public static void main(String[] args) {
        System.out.println("The grade is :");
        printGrade(85);

        System.out.println("The grade is");
        printGrade(40);
    }
    public static void printGrade(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}