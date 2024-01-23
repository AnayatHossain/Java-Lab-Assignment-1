import javax.swing.JOptionPane;

public class AdditionWithJOptionPane {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        double number1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        double number2 = Double.parseDouble(input2);

        double sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
