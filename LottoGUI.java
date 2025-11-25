import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class LottoGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createWindow());
    }

    public static void createWindow() {
        JFrame frame = new JFrame("Lotto Number Checker");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(9, 2));

        JTextField[] userInputs = new JTextField[6];

        // Labels + Inputs for user numbers
        for (int i = 0; i < 6; i++) {
            frame.add(new JLabel("Enter number " + (i + 1) + ": "));
            userInputs[i] = new JTextField();
            frame.add(userInputs[i]);
        }

        JButton checkButton = new JButton("Check Lotto");
        JButton clearButton = new JButton("Clear");

        frame.add(checkButton);
        frame.add(clearButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        frame.add(new JScrollPane(resultArea));

        // Button Action
        checkButton.addActionListener(e -> {
            int[] userNumbers = new int[6];

            // Validate user inputs
            try {
                for (int i = 0; i < 6; i++) {
                    userNumbers[i] = Integer.parseInt(userInputs[i].getText());
                    if (userNumbers[i] < 1 || userNumbers[i] > 49)
                        throw new NumberFormatException();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers (1–49)");
                return;
            }

            int[] winningNumbers = generateLottoNumbers();

            // Count matches
            int matches = 0;
            for (int num : userNumbers) {
                for (int win : winningNumbers) {
                    if (num == win)
                        matches++;
                }
            }

            // Display results
            resultArea.setText(
                "Your Numbers: " + Arrays.toString(userNumbers) +
                "\nWinning Numbers: " + Arrays.toString(winningNumbers) +
                "\n\nYou matched: " + matches + " numbers!"
            );
        });

        clearButton.addActionListener(e -> {
            for (JTextField txt : userInputs) txt.setText("");
            resultArea.setText("");
        });

        frame.setVisible(true);
    }

    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49) + 1;
        }
        return numbers;
    }
}
