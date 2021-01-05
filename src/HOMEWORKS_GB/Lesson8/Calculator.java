package HOMEWORKS_GB.Lesson8;

import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;
    private ActionListener concatenationButtonListener;

    public Calculator() {
        initMandatoryComponents();
        setTitle("Calculator");
        setBounds(0, 0, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(initTop(), BorderLayout.NORTH);
        add(initNumbersBottom(), BorderLayout.CENTER);
        add(initLeftOperations(), BorderLayout.WEST);
        add(initRightOperations(), BorderLayout.EAST);
        setResizable(false);
        setVisible(true);
    }

    private void initMandatoryComponents() {
        textField = new JTextField();
    }

    private JPanel initNumbersBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4, 3));
        concatenationButtonListener = new ConcatenationButtonListener(textField);

        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(concatenationButtonListener);
            bottom.add(btn);
        }
        JButton submit = new JButton("=");
        submit.addActionListener(new CalculationListener(textField));

        JButton zero = new JButton("0");
        zero.addActionListener(concatenationButtonListener);
        JButton realNumber = new JButton(".");
        realNumber.addActionListener(concatenationButtonListener);

        bottom.add(submit);
        bottom.add(zero);
        bottom.add(realNumber);
        return bottom;
    }

    private JPanel initLeftOperations() {
        JPanel leftOperations = new JPanel();
        leftOperations.setLayout(new GridLayout(4, 1));
        concatenationButtonListener = new ConcatenationButtonListener(textField);

        JButton sqr = new JButton("sqr");
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textField.getText();
                String[] operators = value.split("sqr");
                textField.setText(
                        String.valueOf(Double.parseDouble(operators[0]) * Double.parseDouble(operators[0])));
            }
        });

        JButton sqrt = new JButton("sqrt");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textField.getText();
                String[] operators = value.split("sqrt");
                textField.setText(
                        String.valueOf(
                                Math.sqrt(Double.parseDouble(operators[0])))
                );
            }
        });

        JButton percentage = new JButton("%");
        percentage.addActionListener(concatenationButtonListener);

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        leftOperations.add(sqrt);
        leftOperations.add(sqr);
        leftOperations.add(percentage);
        leftOperations.add(clear);
        return leftOperations;
    }

    private JPanel initRightOperations() {
        JPanel rightOperations = new JPanel();
        rightOperations.setLayout(new GridLayout(4, 1));
        concatenationButtonListener = new ConcatenationButtonListener(textField);

        JButton plus = new JButton("+");
        plus.addActionListener(concatenationButtonListener);

        JButton minus = new JButton("-");
        minus.addActionListener(concatenationButtonListener);

        JButton multiple = new JButton("*");
        multiple.addActionListener(concatenationButtonListener);

        JButton division = new JButton("/");
        division.addActionListener(concatenationButtonListener);

        rightOperations.add(plus);
        rightOperations.add(minus);
        rightOperations.add(multiple);
        rightOperations.add(division);
        return rightOperations;
    }

    private JPanel initTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        textField = new JTextField();
        textField.setEditable(false);
        top.add(textField, BorderLayout.CENTER);
        return top;
    }
}

