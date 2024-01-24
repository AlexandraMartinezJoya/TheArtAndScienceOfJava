import acm.gui.*;
import acm.program.Program;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends Program {

    public void init() {
        setLayout(new TableLayout(5,4 ));
        display = new CalculatorDisplay();
        add(display, "gridwidth=4 height=" + BUTTON_SIZE);
        addButtons();
        addActionListeners();
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source instanceof CalculatorButton) {
            ((CalculatorButton) source).action(display);
        }
    }

    private void addButtons() {
        String constraint = "width=" + BUTTON_SIZE + " height="+ BUTTON_SIZE;
        add(new DigitButton(7), constraint);
        add(new DigitButton(8), constraint);
        add(new DigitButton(9), constraint);
        add(new AddButton(), constraint);
        add(new DigitButton(4), constraint);
        add(new DigitButton(5), constraint);
        add(new DigitButton(6), constraint);
        add(new SubtractButton(), constraint);
        add(new DigitButton(1), constraint);
        add(new DigitButton(2), constraint);
        add(new DigitButton(3), constraint);
        add(new MultiplyButton(), constraint);
        add(new ClearButton(), constraint);
        add(new DigitButton(0), constraint);
        add(new EqualsButton(), constraint);
        add(new DivideButton(), constraint);
    }

    /* Private constants and instance variables */
    private final int BUTTON_SIZE = 40;
    private CalculatorDisplay display;
}
