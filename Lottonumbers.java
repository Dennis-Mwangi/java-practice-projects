public class Lottonumbers {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("Lottery Numbers:");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }   

    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49) + 1; // Generate numbers between 1 and 49
        }
        return numbers;
    }
}