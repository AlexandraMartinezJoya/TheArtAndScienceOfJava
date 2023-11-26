import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FontSampler extends GraphicsProgram {

    public void init(){
        fontField = new JTextField(MAX_FONT_NAME);
        fontField.addActionListener(this);
        add(new JLabel("Font"), SOUTH);
        add(fontField, SOUTH);
        lastY = 0;
        lastLabel = new GLabel(TEST_STRING);
        addGLabel(lastLabel);
    }

    /**
     * Called when any action event is generated
     */
      public void actionPerformed(ActionEvent e) {
          if(e.getSource() == fontField) {
              GLabel label = new GLabel(TEST_STRING);
              label.setFont(lastLabel.getFont());
              label.setFont(fontField.getText());
              addGLabel(label);
              lastLabel = label;
          }
      }

    /**
     * Adds a GLabel on the next line, adjusting the different values
     */
    private void addGLabel (GLabel label){
        lastY += label.getHeight();
        lastY +=  lastLabel.getDescent() - label.getDescent();
        add(label, LEFT_MARGIN, lastY);
    }

    /**
     * Private instance variables
     */
    private JTextField fontField;
    private GLabel lastLabel;
    private double lastY;

    /**
     * Private constants
     */
    private final int MAX_FONT_NAME = 30;
    private final int LEFT_MARGIN = 3;
    private final String TEST_STRING = "steffen linck is my favorite musician";
}
