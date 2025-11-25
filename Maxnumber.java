public class Maxnumber {
    public static void main(String[] args) {
     int number,max;
        number = (int)(Math.random()*100);
        max = (int)(Math.random()*100);
        System.out.println("Number 1: " + number);
        System.out.println("Number 2: " + max);
        if (number > max) {
            System.out.println("The maximum number is: " + number);
        } else {
            System.out.println("The maximum number is: " + max);
        }
    }
}