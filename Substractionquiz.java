

import java.util.Scanner;

public class Substractionquiz {

    
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("quiz")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is 50 - 20? ");
            int answer = scanner.nextInt();
            if (answer == 30) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is 30.");
            }
                    scanner.close();
                    return;
            
                }
            
            
            }
            
        }

