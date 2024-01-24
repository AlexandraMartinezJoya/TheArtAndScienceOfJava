import javax.swing.*;
import java.awt.*;

abstract class CalculatorButton extends JButton {

    public CalculatorButton(String name) {
        super(name);
        setFont(new Font("SansSerif", Font.PLAIN, 24));
    }

    public abstract void action(CalculatorDisplay display);
}

class DigitButton extends CalculatorButton {

    public DigitButton(int n) {
        super("" + n);
    }

    public void action(CalculatorDisplay display) {
        display.addDigit(Integer.parseInt(getText()));
    }
}

abstract class OperatorButton extends CalculatorButton {
    public OperatorButton(String name) {
        super(name);
    }

    public void action(CalculatorDisplay display) {
        display.setOperator(this);
    }

    public abstract int apply(int lhs, int rhs);
}

class AddButton extends OperatorButton {
    public AddButton() {super("+");}
    public int apply(int lhs, int rhs) {return lhs + rhs;}
}

class SubtractButton extends OperatorButton  {
    public SubtractButton() { super("-");}
    public int apply(int lhs, int rhs) {return lhs - rhs;}
}

class MultiplyButton extends OperatorButton {
    public MultiplyButton() { super("x");}
    public int apply(int lhs, int rhs) { return lhs * rhs;}
}

class DivideButton extends OperatorButton {
    public DivideButton() { super("/");}
    public int apply(int lhs, int rhs) {return lhs / rhs;}
}

class EqualsButton extends CalculatorButton {
    public EqualsButton() { super("=");}
    public void action(CalculatorDisplay display) { display.setOperator(null);}
}

class ClearButton extends CalculatorButton {
    public ClearButton() { super("C");}
    public void action(CalculatorDisplay display){
        display.setOperator(null);
        display.setValue(0);
    }
}
