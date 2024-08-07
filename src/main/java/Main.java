import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    private static void createAndShowGUI() {
        JFrame f = new JFrame("We Wuz Calculatorz");

        JLabel resultLabel = new JLabel("0.0");
        resultLabel.setBounds(10, 10, 360, 50);
        resultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JTextField inputField = new JTextField();
        inputField.setBounds(10, 70, 360, 50);
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setHorizontalAlignment(SwingConstants.RIGHT);

        // operations
        int op_width_loc = 10;
        int op_width_size = 65;
        int starting_loc_op = 10;
        int op_height_loc_1 = 305;
        int op_height_loc_2 = 230;

        // row 1 of operations
        JButton add = new JButton("+");
        add.setBounds(starting_loc_op, op_height_loc_1,
                op_width_size, 65);

        JButton minus = new JButton("-");
        minus.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 1), op_height_loc_1,
                op_width_size, 65);

        JButton divide = new JButton("/");
        divide.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 2), op_height_loc_1,
                op_width_size, 65);

        JButton multiplication = new JButton("X");
        multiplication.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 3), op_height_loc_1,
                op_width_size, 65);

        JButton clear = new JButton("CE");
        clear.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 4), op_height_loc_1,
                op_width_size, 65);

        // row 2 of operations
        JButton fib = new JButton("Fib");
        fib.setBounds(starting_loc_op, op_height_loc_2,
                op_width_size, 65);

        JButton sqrt = new JButton("\u221A");
        sqrt.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 1), op_height_loc_2,
                op_width_size, 65);// \u02B8

        JButton customsqrt = new JButton("\u02B8" + "\u221A");
        customsqrt.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 2), op_height_loc_2,
                op_width_size, 65); 

        JButton square = new JButton("x" + "\u00B2");
        square.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 3), op_height_loc_2,
                op_width_size, 65); 

        JButton customsquare = new JButton("x" + "\u02B8");
        customsquare.setBounds(
                starting_loc_op + ((op_width_size + op_width_loc) * 4), op_height_loc_2,
                op_width_size, 65); 

        // numbers
        int num_width_loc = 7;
        int num_width_size = 30;
        int starting_loc_num = 11;
        int num_height_loc = 190;

        JButton one = new JButton("1");
        one.setBounds(starting_loc_num,
                num_height_loc, num_width_size, 30);
        one.setFont(new Font("Arial", Font.PLAIN, 16));
        one.setMargin(new Insets(0, 0, 0, 0));

        JButton two = new JButton("2");
        two.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 1),
                num_height_loc, num_width_size, 30);
        two.setFont(new Font("Arial", Font.PLAIN, 16));
        two.setMargin(new Insets(0, 0, 0, 0));

        JButton three = new JButton("3");
        three.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 2),
                num_height_loc, num_width_size, 30);
        three.setFont(new Font("Arial", Font.PLAIN, 16));
        three.setMargin(new Insets(0, 0, 0, 0));

        JButton four = new JButton("4");
        four.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 3),
                num_height_loc, num_width_size, 30);
        four.setFont(new Font("Arial", Font.PLAIN, 16));
        four.setMargin(new Insets(0, 0, 0, 0));

        JButton five = new JButton("5");
        five.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 4),
                num_height_loc, num_width_size, 30);
        five.setFont(new Font("Arial", Font.PLAIN, 16));
        five.setMargin(new Insets(0, 0, 0, 0));

        JButton six = new JButton("6");
        six.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 5),
                num_height_loc, num_width_size, 30);
        six.setFont(new Font("Arial", Font.PLAIN, 16));
        six.setMargin(new Insets(0, 0, 0, 0));

        JButton seven = new JButton("7");
        seven.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 6),
                num_height_loc, num_width_size, 30);
        seven.setFont(new Font("Arial", Font.PLAIN, 16));
        seven.setMargin(new Insets(0, 0, 0, 0));

        JButton eight = new JButton("8");
        eight.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 7),
                num_height_loc, num_width_size, 30);
        eight.setFont(new Font("Arial", Font.PLAIN, 16));
        eight.setMargin(new Insets(0, 0, 0, 0));

        JButton nine = new JButton("9");
        nine.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 8),
                num_height_loc, num_width_size, 30);
        nine.setFont(new Font("Arial", Font.PLAIN, 16));
        nine.setMargin(new Insets(0, 0, 0, 0));

        JButton zero = new JButton("0");
        zero.setBounds(starting_loc_num + ((num_width_loc + num_width_size) * 9),
                num_height_loc, num_width_size, 30);
        zero.setFont(new Font("Arial", Font.PLAIN, 16));
        zero.setMargin(new Insets(0, 0, 0, 0));

        // muh calc object
        calculator calc = new calculator();

        // operations action events
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.add(inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.minus(inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.divide(inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        multiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.multiply(inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.clear();
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        fib.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.fib(resultLabel.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.sqrt(resultLabel.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        customsqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.customsqrt(resultLabel.getText(), inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.square(resultLabel.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        customsquare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.customsquare(resultLabel.getText(), inputField.getText());
                resultLabel.setText(String.valueOf(calc.getResult()));
                inputField.setText("");
            }
        });

        // nums action events
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "9");
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + "0");
            }
        });
        // adding nums
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.add(zero);
        // show
        f.add(resultLabel);
        f.add(inputField);
        // functions
        f.add(add);
        f.add(minus);
        f.add(divide);
        f.add(multiplication);
        f.add(clear);
        f.add(fib);
        f.add(sqrt);
        f.add(customsqrt);
        f.add(square);
        f.add(customsquare);
        // other stuff
        f.setSize(385, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
