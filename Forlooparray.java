//a Variable can store multiple values using an Array.


public class Forlooparray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[1]=60; //modifying array element
                        sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("size of array: " + numbers.length   );


        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
