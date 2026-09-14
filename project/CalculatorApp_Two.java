package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp_Two extends JFrame implements ActionListener {
    // Components
    private JTextField displayField;
    private JPanel buttonPanel;
    private String[] buttonLabels = {
            "7", "8", "9", "/", "CE",
            "4", "5", "6", "*", "C",
            "1", "2", "3", "-", "√",
            "0", ".", "=", "+", "1/x"
    };
    private JButton[] buttons = new JButton[20];

    // Current state
    private String currentInput = "";
    private double firstOperand = 0;
    private String operator = "";

    public CalculatorApp_Two() {
        // Use a cross-platform look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Calculator");
        setSize(300, 400); // Adjusted window size
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create display field
        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.BOLD, 24)); // Adjusted font size
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setText("0");
        add(displayField, BorderLayout.NORTH);

        // Create button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5)); // Adjusted layout to 5x4 with gaps
        add(buttonPanel, BorderLayout.CENTER);

        // Add buttons
        for (int i = 0; i < 20; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 20)); // Button font size adjusted
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            currentInput = "";
            displayField.setText("0");
        } else if (command.equals("CE")) {
            currentInput = "";
            displayField.setText("0");
            firstOperand = 0;
            operator = "";
        } else if (command.equals("=")) {
            calculateResult();
        } else if (command.equals("/") || command.equals("*") || command.equals("-") || command.equals("+")) {
            operator = command;
            firstOperand = Double.parseDouble(currentInput);
            currentInput = "";
        } else if (command.equals("√")) {
            double result = Math.sqrt(Double.parseDouble(currentInput));
            displayField.setText(Double.toString(result));
            currentInput = Double.toString(result);
        } else if (command.equals("1/x")) {
            double result = 1 / Double.parseDouble(currentInput);
            displayField.setText(Double.toString(result));
            currentInput = Double.toString(result);
        } else {
            // Number or decimal point
            if (currentInput.equals("0")) {
                currentInput = command; // Remove leading zero
            } else {
                currentInput += command;
            }
            displayField.setText(currentInput);
        }
    }

    private void calculateResult() {
        double secondOperand = Double.parseDouble(currentInput);
        double result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    displayField.setText("Error");
                    return;
                }
                break;
        }

        displayField.setText(Double.toString(result));
        currentInput = Double.toString(result);
    }

    public static void main(String[] args) {
        CalculatorApp_Two calculator = new CalculatorApp_Two();
        calculator.setVisible(true);
    }
}