public class Hackwifipassword {
    public static void main(String[] args) {
        String[] commonPasswords = {
            "123456", "password", "123456789", "12345678", "12345",
            "111111", "1234567", "sunshine", "qwerty", "iloveyou"
        };
    }   

    public static void printCommonPasswords(String[] passwords) {
        System.out.println("Common WiFi Passwords:");
        for (String password : passwords) {
            System.out.println(password);
        }
    }
}
