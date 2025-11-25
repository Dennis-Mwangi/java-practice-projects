
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BruteForceSimulatorGUI extends JFrame {

    private JTextField passwordField;
    private JTextArea outputArea;

    public BruteForceSimulatorGUI() {
        setTitle("Brute Force Simulator (Educational)");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Enter a password to simulate brute force:"));
        passwordField = new JTextField(15);
        topPanel.add(passwordField);

        JButton startButton = new JButton("Start Simulation");
        topPanel.add(startButton);
        add(topPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runBruteForce();
            }
        });
    }

    private void runBruteForce() {
        String target = passwordField.getText();
        outputArea.setText("");

        if (target.isEmpty()) {
            outputArea.setText("Enter a password first!");
            return;
        }

        String chars = "abcdefghijklmnopqrstuvwxyz";
        int attempts = 0;

        for (char c1 : chars.toCharArray()) {
            for (char c2 : chars.toCharArray()) {
                attempts++;
                String attempt = "" + c1 + c2;

                outputArea.append("Trying: " + attempt + "\n");

                if (attempt.equals(target)) {
                    outputArea.append("\nPassword cracked: " + attempt);
                    outputArea.append("\nAttempts: " + attempts);
                    return;
                }
            }
        }

        outputArea.append("Password not found (Only simulating aa–zz).");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BruteForceSimulatorGUI().setVisible(true);
        });
    }
}
