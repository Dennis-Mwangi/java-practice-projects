public class Primenumbers {
    public static void main(String[] args) {
        int count = 1;
        while (count<=10)
        System.out.println(" Prime number: " + count);
        count++;
        {
            if (extracted(count)) {
                System.out.println(" Prime number: " + count);
            }

            
        }
    }

    private static boolean extracted(int count) {
        return count % 2 != 0 && count % 3 != 0 && count % 5 != 0 && count % 7 != 0;
    }
}
