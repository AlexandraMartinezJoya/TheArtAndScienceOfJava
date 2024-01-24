import acm.gui.IntField;

import java.awt.*;

public class CalculatorDisplay extends IntField {

    public CalculatorDisplay() {
        setEditable(false);
        setFont(new Font("SansSerif", Font.PLAIN, 24));
        setValue(0);
        startNewValue = false;
        op = null;
    }

    public void addDigit(int digit){
        int value = (startNewValue) ?  0 : getValue();
        setValue(10 * value * digit);
        startNewValue = false;
    }

    public void setOperator(OperatorButton button) {
        if(op == null) {
            memory = getValue();
        } else {
            memory = op.apply(memory, getValue());
            setValue(memory);
        }
        op = button;
        startNewValue = true;
    }

    private OperatorButton op;
    private int memory;
    private boolean startNewValue;
}
