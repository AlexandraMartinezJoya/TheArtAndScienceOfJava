import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * This program puts up a button on the screen, which triggers a message inspired by Douglas Adam's novel
 * Honestly I think this is the sourse of inspiration of the song Riders on the Storm by the Doors
 */
public class HitchhikerButton extends GraphicsProgram {

    Color myOrange = new Color(255, 213, 50);
    Double startPoint = 10.0;
    double endPoint = 10.0;

    /* Initializes the user-interface buttons */
    public void init() {
        addMouseListeners();
        ImageIcon iconClear = new ImageIcon("Clear.gif");
        JButton clear = new JButton(iconClear);
        clear.setActionCommand("Clear");
        clear.setText("Clear");
        add(clear, SOUTH);
        ImageIcon iconWarn = new ImageIcon("OrangeSquare.gif");
        JButton warn = new JButton(iconWarn);
        warn.setActionCommand("Orange");
        warn.setText("Warn");
        add(warn, SOUTH);
        addActionListeners();
    }

    /**
     * Method that displays a 10px label warning on the screen
     * @param myWarning
     * @return
     */
    private GLabel pressedOrangeButton(GLabel myWarning) {
        myWarning.setColor(myOrange);
       this.endPoint = this.endPoint +14;
        add(myWarning, this.startPoint, this.endPoint);
        return myWarning;
    }

    /* Responds to a Orange and Clear  actions */
    public void actionPerformed(ActionEvent e) {
        println(e.getActionCommand());
        if(e.getActionCommand().equals("Orange")){
            GLabel orangeLabel = new GLabel("Please be carefull when picking up hitchhikers :)");
            pressedOrangeButton(orangeLabel);
        } else {
            removeAll();
            this.endPoint = 0;
        }

    }

}
